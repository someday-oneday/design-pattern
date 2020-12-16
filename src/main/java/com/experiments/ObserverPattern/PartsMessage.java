package com.experiments.ObserverPattern;

public class PartsMessage {
    public static void main(String[] args){
        PartsData partsData=new PartsData();
        Quantier quantier=new Quantier(partsData);
        Worker worker=new Worker(partsData);

        partsData.setMessage("屏幕", "不合格");
        partsData.setMessage("内存","不合格");
    }
}
