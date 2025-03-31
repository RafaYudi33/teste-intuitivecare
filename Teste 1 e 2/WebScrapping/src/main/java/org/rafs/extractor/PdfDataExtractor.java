package org.rafs.extractor;

import java.util.List;

public interface PdfDataExtractor {
    List<List<String>> extractData(String pdfPath);
}
