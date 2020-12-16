package com.experiments.ObserverPattern;

public interface Subject {
    public void addObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}
