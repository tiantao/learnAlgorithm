package com.tiantao.learn.jdk;


/**
 * Created by tiantao on 2018/5/10.
 */
public class ArrayList {

    java.util.ArrayList list = new java.util.ArrayList();


    public static void main(String[] args) {
        java.util.ArrayList  list = new java.util.ArrayList(20);
        int num = 22;
        System.out.println(list.size());
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("b");
        list.add("b");
        list.add("b");
        list.add("b");
        list.add("b");
        list.add("b");
        list.add("b");
        list.add("b");
        System.out.println(list.size());

    }

}
