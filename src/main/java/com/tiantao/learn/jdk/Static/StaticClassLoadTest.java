package com.tiantao.learn.jdk.Static;

/**
 * @Author: tiantao
 * @Date: 2019/1/16 10:38 AM
 * @Version 1.0
 * https://blog.csdn.net/tiantiandjava/article/details/86505855
 */
public class StaticClassLoadTest {

    public static void main(String[] args) {
        System.out.println("StaticClassLoadTest...");
        printStaticVar();
    }

    private static void printStaticVar() {

        System.out.println(StaticClass.FIANL_VALUE);

        System.out.println(StaticClass.VALUE);

    }
}
