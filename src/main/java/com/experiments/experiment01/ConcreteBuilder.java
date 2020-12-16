package com.experiments.experiment01;

public class ConcreteBuilder extends Builder{
    Phone phone = new Phone();
    //组装产品
    @Override
    public void  buildCPU(){
        phone.add("CPU");
    }

    @Override
    public void  buildBattery(){
        phone.add("电池");
    }

    @Override
    public void  buildMemory(){
        phone.add("内存");
    }

    @Override
    public void buildScreen() {
        phone.add("屏幕");
    }

    @Override
    public void buildNFC() {
        phone.add("NFC");
    }

    @Override
    public void buildFingerpointRecognition() {
        phone.add("指纹识别");
    }

    @Override
    public void buildGPS() {
        phone.add("GPS");
    }

    @Override
    public void buildCamera() {
        phone.add("摄像头");
    }

    @Override
    public Phone getPhone() {
        return phone;
    }
}

