package com.tiantao.learn.jdk.Static;

/**
 * @Author: tiantao
 * @Date: 2019/1/16 10:37 AM
 * @Version 1.0
 * https://blog.csdn.net/tiantiandjava/article/details/86505855
 */
public class StaticClass {
    static {
        System.out.println("StaticClass loading...");
    }

    public static String VALUE = "static value loading B";

    public static final String FIANL_VALUE = "fianl value loading B";
}
