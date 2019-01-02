package com.tiantao.learn.jdk;


import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

/**
 * HashMap 是个离散数组加链表 的数据结构
 * Created by tiantao on 2018/5/3.
 */
public class HashMap {
    java.util.HashMap hashMap = new java.util.HashMap();
    java.util.Hashtable hashtable = new Hashtable();
    java.util.concurrent.ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();

    public static void main(String[] args) {
        int h = "st1r12222".hashCode();
        System.out.println(h);

        int n = h >>> 16;
        System.out.println(n);
        int x = h ^ n;
        System.out.println(x);
        System.out.println((h = "str".hashCode()) ^ (h >>> 16));
        System.out.println(16 - 1 & x);

        String a = "Aa";
        String b = "BB";
        int aa = a.hashCode();
        int bb = b.hashCode();

        System.out.println(aa);
        System.out.println(bb);

        Object o = new Object();
        System.out.println(15  & o.hashCode());

        System.out.println(1 << 30);
        System.out.println(1 << 1);
        System.out.println(Integer.MAX_VALUE);

    }

}
