package com.experiments.experiment02;

public class Client {
    public static void main(String[] args){
        //客户要老年版
        concreteOlderVersion();
        //客户要摄影版
        concretePhotographicVersion();
        //客户要旗舰版
        concreteUltimateVersion();
    }
    //组装必选部分
    public static void concreteRequired(){
        FactoryBattery factoryBattery=new FactoryBattery();
        factoryBattery.factoryMethod();
        FactoryCPU factoryCPU=new FactoryCPU();
        factoryCPU.factoryMethod();
        FactoryMemory factoryMemory=new FactoryMemory();
        factoryBattery.factoryMethod();
        FactoryScreen factoryScreen=new FactoryScreen();
        factoryScreen.factoryMethod();
    }
    //组装老年机
    public static void concreteOlderVersion(){
        System.out.print("老年版：");
        concreteRequired();
    }
    //组装摄影机
    public static void concretePhotographicVersion(){
        System.out.print("\n摄影版：");
        concreteRequired();
        Factory factoryCamera=new FactoryCamera();
        factoryCamera.factoryMethod();
    }
    //组装旗舰版
    public static void concreteUltimateVersion(){
        System.out.print("\n旗舰版：");
        concreteRequired();
        Factory factoryCamera=new FactoryCamera();
        factoryCamera.factoryMethod();
        Factory factoryFingerprintIdentification=new FactoryFingerprintIdentification();
        factoryFingerprintIdentification.factoryMethod();
        Factory factoryGPS=new FactoryGPS();
        factoryGPS.factoryMethod();
        Factory factoryNFC=new FactoryNFC();
        factoryNFC.factoryMethod();
    }
}
