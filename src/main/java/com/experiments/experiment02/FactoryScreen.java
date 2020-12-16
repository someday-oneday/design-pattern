package com.experiments.experiment02;

public class FactoryScreen extends Factory {
    @Override
    public Product factoryMethod() {
        return new Screen();
    }
}
