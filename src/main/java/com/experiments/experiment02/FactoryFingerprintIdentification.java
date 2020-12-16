package com.experiments.experiment02;

public class FactoryFingerprintIdentification extends Factory {
    @Override
    public Product factoryMethod() {
        return new FingerprintIdentification();
    }
}
