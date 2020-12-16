package com.experiments.experiment02;

public class FactoryGPS extends Factory {
    @Override
    public Product factoryMethod() {
        return new GPS();
    }
}
