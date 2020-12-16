package com.experiments.ObserverPattern;

public class Quantier implements Observer{
    private Subject partsData;

    public Quantier(Subject partsData){
        this.partsData=partsData;
        partsData.addObserver(this);
    }

    @Override
    public void post(String type, String quantity) {
        System.out.println("我是质管员,我记录的当前部件是"+type+",质量"+quantity);
    }
}
