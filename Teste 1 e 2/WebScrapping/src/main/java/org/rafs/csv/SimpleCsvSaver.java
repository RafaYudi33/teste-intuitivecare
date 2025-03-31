package org.rafs.csv;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class SimpleCsvSaver implements CsvSaver {

    @Override
    public void save(List<List<String>> data, String outputPath) {
        try (FileWriter writer = new FileWriter(outputPath)) {
            for (List<String> row : data) {
                String line = String.join(";", row);
                writer.write(line + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException("Error saving CSV: " + e.getMessage(), e);
        }

    }

}
