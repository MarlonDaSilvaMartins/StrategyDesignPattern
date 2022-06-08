package com.StrategyDesignPattern.controller;

import com.StrategyDesignPattern.service.CalcularService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("v1/imposto")
public class Controller {
    private final CalcularService calcularService;

    @GetMapping("/icms")
    public Double calcularICMS(@RequestParam Double valor){
        return calcularService.calcularICMS(valor);
    }

    @GetMapping("/ipi")
    public Double calcularIPI(@RequestParam Double valor){
        return calcularService.calcularIPI(valor);
    }
}
