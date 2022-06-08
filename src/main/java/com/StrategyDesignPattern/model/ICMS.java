package com.StrategyDesignPattern.model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ICMS implements Imposto{
    private Double valor;

    @Override
    public Double calcular(){
        return this.valor*0.10;
    }
}
