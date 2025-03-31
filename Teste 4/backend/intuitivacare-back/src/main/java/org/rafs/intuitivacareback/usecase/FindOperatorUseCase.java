package org.rafs.intuitivacareback.usecase;



import org.rafs.intuitivacareback.gateway.OperatorGateway;
import org.rafs.intuitivacareback.domain.model.Operator;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FindOperatorUseCase {

    private final OperatorGateway operatorGateway;

    public FindOperatorUseCase(OperatorGateway operatorGateway) {
        this.operatorGateway = operatorGateway;
    }

    public List<Operator> findByCity(String city) {
        return operatorGateway.findByCity(city);
    }


}
