package org.rafs.csv;

import java.util.List;

public interface CsvSaver {
    void save(List<List<String>> data, String outputPath);
}
