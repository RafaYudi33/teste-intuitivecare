package org.rafs.intuitivacareback.infra.gateway.csv;


import jakarta.annotation.PostConstruct;
import org.rafs.intuitivacareback.gateway.OperatorGateway;
import org.rafs.intuitivacareback.infra.gateway.mapper.OperatorMapper;
import org.rafs.intuitivacareback.infra.persistence.csv.OperatorCsv;
import org.rafs.intuitivacareback.domain.model.Operator;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class OperatorCsvGatewayImpl implements OperatorGateway {

    private List<OperatorCsv> operatorsCsv;
    private final OpenCsvLoaderImpl csvLoader;
    private final OperatorMapper operatorMapper;

    @Value("${app.csv.path}")
    private String csvPath;

    public OperatorCsvGatewayImpl(OpenCsvLoaderImpl csvLoader, OperatorMapper operatorMapper) {
        this.csvLoader = csvLoader;
        this.operatorMapper = operatorMapper;
    }

    @PostConstruct
    public void init() {
        this.operatorsCsv = this.csvLoader.load(csvPath);
    }

    @Override
    public List<Operator> findByCity(String city) {

        List<OperatorCsv> foundedData = this.operatorsCsv.stream()
                .filter(operator -> city.equalsIgnoreCase(operator.getCity()))
                .collect(Collectors.toList());

        return operatorMapper.toOperatorDomainList(foundedData);
    }
}
