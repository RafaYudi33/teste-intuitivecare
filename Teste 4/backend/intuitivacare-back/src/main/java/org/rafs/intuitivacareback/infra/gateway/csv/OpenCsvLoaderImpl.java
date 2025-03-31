package org.rafs.intuitivacareback.infra.gateway.csv;

import com.opencsv.bean.CsvToBeanBuilder;
import org.rafs.intuitivacareback.infra.persistence.csv.OperatorCsv;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

@Component
public class OpenCsvLoaderImpl implements CsvLoader<OperatorCsv> {
    @Override
    public List<OperatorCsv> load(String path) {
        try {

            ClassPathResource resource = new ClassPathResource(path);
            BufferedReader reader = new BufferedReader(new InputStreamReader(resource.getInputStream()));

            return new CsvToBeanBuilder<OperatorCsv>(reader)
                    .withType(OperatorCsv.class)
                    .withSeparator(';')
                    .build()
                    .parse();
        } catch (Exception e) {
            throw new RuntimeException("Error loading csv: ", e);
        }
    }
}
