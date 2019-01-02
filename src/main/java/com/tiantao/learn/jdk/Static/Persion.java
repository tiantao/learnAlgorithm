package com.tiantao.learn.jdk.Static;

/**
 * Created by tiantao on 2018/5/29.
 */
public class Persion {


    private String name;

    public Persion(String name) {
        this.name = name;
        System.out.println("The persion name is:" + this.getName());
    }

    public Persion() {
        System.out.println("mew Persion");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
