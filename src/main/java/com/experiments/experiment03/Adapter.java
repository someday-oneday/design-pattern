package com.experiments.experiment03;

public class Adapter extends MicroUSB implements TypeCUSB {
    @Override
    public void TypeCUSBcharge() {
        this.MicroUSBcharge();
    }

    @Override
    public void TypeCUSBread() {
        this.MicroUSBread();
    }
}

