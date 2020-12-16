package com.experiments.experiment02;

public class FactoryBattery extends Factory {
    @Override
    public Product factoryMethod() {
        return new Memory();
    }
}
