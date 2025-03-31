package org.rafs.extractor;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import technology.tabula.*;
import technology.tabula.extractors.SpreadsheetExtractionAlgorithm;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class TabulaPdfDataExtractor implements PdfDataExtractor {

    @Override
    public List<List<String>> extractData(String pdfPath) {
        List<List<String>> extractedData = new ArrayList<>();
        List<String> firstHeader = null;

        try (PDDocument document = Loader.loadPDF(new File(pdfPath))) {
            ObjectExtractor extractor = new ObjectExtractor(document);
            PageIterator pi = extractor.extract();

            SpreadsheetExtractionAlgorithm sea = new SpreadsheetExtractionAlgorithm();

            int pageNumber = 1;
            while (pi.hasNext()) {
                Page page = pi.next();

                if (pageNumber++ < 3) continue;

                List<Table> tables = sea.extract(page);

                for (Table table : tables) {
                    for (List<RectangularTextContainer> row : table.getRows()) {
                        List<String> line = new ArrayList<>();
                        for (RectangularTextContainer cell : row) {
                            line.add(cell.getText().replace("\r", " ").trim());
                        }

                        if (firstHeader == null) {
                            firstHeader = line;
                            extractedData.add(line);
                            continue;
                        }

                        if (line.equals(firstHeader)) continue;
                        extractedData.add(line);
                    }
                }
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro ao extrair dados com Tabula: " + e.getMessage(), e);
        }
        replaceAbbreviationsInRows(extractedData);
        return extractedData;
    }


    private void replaceAbbreviationsInRows(List<List<String>> data) {
        for (int i = 0; i < data.size(); i++) {
            List<String> row = data.get(i);
            for (int j = 0; j < row.size(); j++) {
                String cell = row.get(j);
                if ("OD".equalsIgnoreCase(cell)) {
                    row.set(j, "Seg. Odontológica");
                } else if ("AMB".equalsIgnoreCase(cell)) {
                    row.set(j, "Seg. Ambulatorial");
                }
            }
        }
    }
}

