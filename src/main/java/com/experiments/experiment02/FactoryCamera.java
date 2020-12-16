package com.experiments.experiment02;

class FactoryCamera extends Factory{
    @Override
    public Product factoryMethod() {
        return new Camera();
    }
}

