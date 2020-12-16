package com.experiments.experiment04;

public class MessageFanctory {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject=new ConcreteSubject();
        Observer quantier=new Quantier();
        Observer worker=new Worker();
        concreteSubject.addObserver(quantier);
        concreteSubject.addObserver(worker);
        informationCPU(concreteSubject);
        informationGPS(concreteSubject);
    }
    public static void informationCPU(ConcreteSubject concreteSubject){
        concreteSubject.setInformation("CPU","质量出现问题");
    }
    public static void informationGPS(ConcreteSubject concreteSubject){
        concreteSubject.setInformation("GPS","质量出现问题");
    }
}
