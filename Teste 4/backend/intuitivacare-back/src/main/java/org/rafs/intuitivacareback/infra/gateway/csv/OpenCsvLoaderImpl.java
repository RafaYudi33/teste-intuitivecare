package org.rafs.intuitivacareback.infra.gateway.csv;


import com.opencsv.bean.CsvToBeanBuilder;

import org.rafs.intuitivacareback.infra.persistence.csv.OperatorCsv;
import org.springframework.stereotype.Component;

import java.io.FileReader;
import java.util.List;

@Component
public class OpenCsvLoaderImpl implements CsvLoader<OperatorCsv> {
    @Override
    public List<OperatorCsv> load(String path) {
        try {
            return new CsvToBeanBuilder<OperatorCsv>(new FileReader(path))
                    .withType(OperatorCsv.class)
                    .withSeparator(';')
                    .build()
                    .parse();
        } catch (Exception e) {
            throw new RuntimeException("Error loading csv: ", e);
        }
    }
}
