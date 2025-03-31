package org.rafs.intuitivacareback.infra.controller;


import org.rafs.intuitivacareback.domain.model.Operator;
import org.rafs.intuitivacareback.usecase.FindOperatorUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/operator")
@CrossOrigin("*")
public class OperatorController {

    private final FindOperatorUseCase findOperatorUseCase;

    public OperatorController(FindOperatorUseCase findOperatorUseCase) {
        this.findOperatorUseCase = findOperatorUseCase;
    }

    @GetMapping
    public ResponseEntity<List<Operator>> findByCity(@RequestParam String city) {
        List<Operator> operators = findOperatorUseCase.findByCity(city);
        return ResponseEntity.ok(operators);
    }
}
