package com.StrategyDesignPattern.model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class IPI implements Imposto{
    private Double valor;

    @Override
    public Double calcular(){
        return this.valor*0.20;
    }
}
