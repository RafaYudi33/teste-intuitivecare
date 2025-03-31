package org.rafs.intuitivacareback.gateway;



import org.rafs.intuitivacareback.domain.model.Operator;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface OperatorGateway {

    List<Operator>findByCity(String city);

}
