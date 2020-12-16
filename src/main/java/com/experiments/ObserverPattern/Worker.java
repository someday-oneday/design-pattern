package com.experiments.ObserverPattern;
public class Worker implements Observer{
    private Subject partsData;

    public Worker(Subject partsData){
        this.partsData=partsData;
        partsData.addObserver(this);
    }

    @Override
    public void post(String type, String quantity) {
        System.out.println("我是工人,我检查的当前部件是"+type+",质量"+quantity);
    }
}
