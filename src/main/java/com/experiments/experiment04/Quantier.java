package com.experiments.experiment04;

public class Quantier implements Observer {

    private String parts;
    private String quality;
    @Override
    public void collect(String parts, String quality) {
        this.quality = quality;
        this.parts = parts;
        action();
    }
    public void action(){
        System.out.println("质检员收到消息：" + parts + quality + "，对该部件进行记录");
    }
}

