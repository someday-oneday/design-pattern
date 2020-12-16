package com.experiments.experiment02;

public class FactoryCPU extends Factory {
    @Override
    public Product factoryMethod() {
        return new CPU();
    }
}
