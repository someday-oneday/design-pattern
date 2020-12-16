package com.experiments.experiment04;

public interface Subject {
    //添加观察者
    void addObserver(Observer o);

    //移除观察者
    void removeObserver(Observer o);

    //通知观察者方法
    void notifyObserver();
}
