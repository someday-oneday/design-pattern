package com.experiments.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public  class PartsData implements Subject{
    private List<Observer> observers;
    private String type;
    private String quantity;

    public PartsData(){
        observers=new ArrayList<>();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i=observers.indexOf(o);
        if (i>=0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        for(Observer o:observers){
            o.post(type,quantity);
        }
    }

    public void setMessage(String type,String quantity){
        this.type=type;
        this.quantity=quantity;
        notifyObserver();
    }
}
