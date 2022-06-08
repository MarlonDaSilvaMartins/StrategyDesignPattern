package com.StrategyDesignPattern.service;

import com.StrategyDesignPattern.model.ICMS;
import com.StrategyDesignPattern.model.IPI;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CalcularService {
    Calculadora calculadora;

    public Double calcularICMS(Double valor){
        ICMS icms = new ICMS(valor);
        return calculadora.calcular(icms);
    }

    public Double calcularIPI(Double valor){
        IPI ipi = new IPI(valor);
        return calculadora.calcular(ipi);
    }
}
