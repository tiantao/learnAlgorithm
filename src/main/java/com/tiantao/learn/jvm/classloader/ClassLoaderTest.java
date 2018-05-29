package com.tiantao.learn.jvm.classloader;

/**
 * Created by tiantao on 2018/5/17.
 */
public class ClassLoaderTest {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        ClassLoader cl = ClassLoaderTest.class.getClassLoader();

        System.out.println("ClassLoader is:"+cl.toString());

        System.out.println("ClassLoader\'s parent is:"+cl.getParent().toString());
        System.out.println("ClassLoader\'s parent\'s  parent is:"+cl.getParent().getParent().toString());

        cl = int.class.getClassLoader();

        System.out.println("ClassLoader is:"+cl.toString());


    }
}
