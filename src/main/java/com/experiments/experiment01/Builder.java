package com.experiments.experiment01;

public  abstract class Builder {
    public abstract void buildCPU();
    public abstract void buildBattery();
    public abstract void buildMemory();
    public abstract void buildScreen();
    public abstract void buildCamera();
    public abstract void buildGPS();
    public abstract void buildFingerpointRecognition();
    public abstract void buildNFC();
    public abstract Phone getPhone();
}
