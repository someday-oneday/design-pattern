package com.experiments.experiment04;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
    private List<Observer> list = new ArrayList<Observer>();
    private String parts;
    private String quality;

    public void addObserver(Observer o) {
        list.add(o);
    }

    public void removeObserver(Observer o) {
        if (!list.isEmpty())
            list.remove(o);
    }

    public void notifyObserver() {
        for (int i = 0; i < list.size(); i++) {
            Observer observer = list.get(i);
            observer.collect(parts,quality);
        }
    }

    public void setInformation(String parts,String quality) {
        this.parts = parts;
        this.quality=quality;
        notifyObserver();
    }
}

