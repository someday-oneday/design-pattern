package com.experiments.experiment02;

public class FactoryMemory extends FactoryNFC {
    @Override
    public Product factoryMethod() {
        return new Memory();
    }
}
