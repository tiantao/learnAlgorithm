package com.tiantao.learn.jdk.Static;

/**
 * Created by tiantao on 2018/5/29.
 */
public class Test {

    public static void main(String[] args) {
        Class2 class2 = new Class2();
        Static.InnerClass1 innerClass1 = new Static().new InnerClass1();
        Static.InnerClass2 innerClass2 = new Static.InnerClass2();

        String ss = "xxx";
        System.out.println(ss.getClass().getClassLoader());
    }
}
