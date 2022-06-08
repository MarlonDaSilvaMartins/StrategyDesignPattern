package com.StrategyDesignPattern.service;

import com.StrategyDesignPattern.model.Imposto;
import org.springframework.stereotype.Component;

@Component
public class Calculadora {
    public Double calcular(Imposto imposto){
        return imposto.calcular();
    }
}
