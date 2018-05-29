package com.tiantao.learn.jvm.classloader;

/**
 * Created by tiantao on 2018/5/17.
 */
public class Launcher {
    public static void main(String[] args) {
        sun.misc.Launcher launcher = new sun.misc.Launcher();

        for (String s: System.getProperty("sun.boot.class.path").split(":")
             ) {
            System.out.println(s);
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        for (String s: System.getProperty("java.ext.dirs").split(":")
                ) {
            System.out.println(s);
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        for (String s: System.getProperty("java.class.path").split(":")
                ) {
            System.out.println(s);
        }
    }
}