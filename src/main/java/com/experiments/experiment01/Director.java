package com.experiments.experiment01;

public class Director{
    private Builder builder;
    public Director(Builder builder){
        this.builder=builder;
    }
    //必选部分
    public void constructRequiredParts(){
        builder. buildCPU();
        builder.buildBattery();
        builder. buildMemory();
        builder. buildScreen();
    }
    //老年版
    public void constructOlderVersion(){
        System.out.println("老年版：");
        constructRequiredParts();
        Phone phone = builder.getPhone();
    }
    //摄影版
    public void constructPhotographicVersion(){
        System.out.println("摄影版：");
        constructRequiredParts();
        builder. buildCamera();
        Phone phone = builder.getPhone();
    }
    //旗舰版
    public void constructUltimateVersion(){
        System.out.println("旗舰版：");
        constructRequiredParts();
        builder. buildCamera();
        builder. buildGPS();
        builder. buildFingerpointRecognition();
        builder. buildNFC();
        Phone phone = builder.getPhone();
    }
}
