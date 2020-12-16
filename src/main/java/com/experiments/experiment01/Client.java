package com.experiments.experiment01;

public class Client {
    public static void main(String[] args) {
        Builder concreteBuilder=new ConcreteBuilder();
        Director director = new Director(concreteBuilder);
        //老年版
        director.constructOlderVersion();
        Phone phoneOlderVersion=concreteBuilder.getPhone();
        phoneOlderVersion.show();
        //摄影版
        director.constructPhotographicVersion();
        Phone PhotographicVersion=concreteBuilder.getPhone();
        PhotographicVersion.show();
        //旗舰版
        director.constructUltimateVersion();
        Phone phoneUltimateVersion=concreteBuilder.getPhone();
        phoneUltimateVersion.show();
    }
    }

