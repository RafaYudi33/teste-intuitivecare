package org.rafs.manager;

import org.rafs.compressor.Compressor;
import org.rafs.csv.CsvSaver;
import org.rafs.extractor.PdfDataExtractor;
import org.rafs.extractor.TabulaPdfDataExtractor;

import java.util.List;

public class DataExtractorManager {
    private final Compressor compressor;
    private final PdfDataExtractor extractor;
    private final CsvSaver csvSaver;

    public DataExtractorManager(Compressor compressor, PdfDataExtractor extractor, CsvSaver csvSaver) {
        this.compressor = compressor;
        this.extractor = extractor;
        this.csvSaver = csvSaver;
    }

    public void extractDataCsvZip(String pdfFilePath, String csvFilePath, String outputPathZipCsv) {
        List<List<String>> data = extractor.extractData(pdfFilePath);
        csvSaver.save(data, csvFilePath);
        compressor.compressFiles(List.of(csvFilePath), outputPathZipCsv);

    }
}
