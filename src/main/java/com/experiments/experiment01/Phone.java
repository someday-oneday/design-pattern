package com.experiments.experiment01;

import java.util.ArrayList;
import java.util.List;

public class Phone {
    private List<String> parts = new ArrayList<String>();

    public void add(String part){
        parts.add(part);
    }
    public void show(){
        for (int i = 0;i<parts.size();i++){
            System.out.println("组件"+parts.get(i)+"已装好");
        }
        System.out.println("组装完成");
    }
}
