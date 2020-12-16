package com.experiments.experiment02;

public class FactoryNFC extends Factory {
    @Override
    public Product factoryMethod() {
        return new NFC();
    }
}
