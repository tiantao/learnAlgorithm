package com.tiantao.learn.jdk.Static;


/**
 * Created by tiantao on 2018/5/29.
 */

/**
 * static 不能修饰 类 （）
 */
public class Static {

    public static String name = "chenssy";

    public static Persion  onePersion = new Persion("one");


    private Persion otherPersion = new Persion("three");


    public static void main(String[] args) {
        Static s = new Static();
        Class2 class2 = new Class2();
    }

    static {
        onePersion = new Persion("two");
    }


    /**
     * 非静态内部类
     * 非静态内部类 不允许有静态变量 同样 也不可以有 静态代码块
     */
    public class InnerClass1{
        private String xxx = "";

    }

    /**
     * 静态内部类
     */
    public static class InnerClass2{

        public static String _name1 = "chenssy_static";

        static {
            System.out.println("可以有静态代码块");
        }

        public void display(){
            /*
             * 静态内部类只能访问外围类的静态成员变量和方法
             * 不能访问外围类的非静态成员变量和方法
             */
            System.out.println("OutClass name :" + name);
        }
    }
}

/**
 * 同一个java文件中不能多个 public 类
 */
class Class2{
    /**
     * 非public的类可以在一个java文件
     */
}
