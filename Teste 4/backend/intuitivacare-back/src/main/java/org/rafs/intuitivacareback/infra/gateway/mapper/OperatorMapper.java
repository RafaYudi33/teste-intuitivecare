package org.rafs.intuitivacareback.infra.gateway.mapper;

import org.apache.commons.beanutils.BeanUtils;
import org.rafs.intuitivacareback.domain.model.Operator;
import org.rafs.intuitivacareback.infra.persistence.csv.OperatorCsv;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class OperatorMapper {

    public List<Operator> toOperatorDomainList(List<OperatorCsv> operatorCsvList) {
        List<Operator> operatorList = new ArrayList<>();
        for (OperatorCsv csv : operatorCsvList) {
            Operator operator = new Operator();
            try {
                BeanUtils.copyProperties(operator, csv);
                operatorList.add(operator);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return operatorList;
    }
}
