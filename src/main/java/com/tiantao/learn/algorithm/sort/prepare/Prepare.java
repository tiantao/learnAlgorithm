package com.tiantao.learn.algorithm.sort.prepare;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

/**
 * Created by tiantao on 2018/1/10.
 */
public class Prepare {
    public static void main(String[] args) {

        int num = 1000000;

        HashSet<Integer> hs = new HashSet();
        Random rd = new Random();

        while (hs.size() < num) {
            hs.add(rd.nextInt(num * 10));
        }

        for (Integer i : hs) {
            System.out.println(i);
        }
    }


    /**
     * 获取无序数组
     * @param count
     * @return
     */
    public static HashSet<Integer> prepareUnorderedNum(int count) {
        HashSet<Integer> hs = new HashSet();
        Random rd = new Random();

        while (hs.size() < count) {
            hs.add(rd.nextInt(count * 10));
        }

        return hs;
    }

    public static Integer[]  prepareUnorderedArray(int count) {
        HashSet<Integer> hs =  prepareUnorderedNum(count);

        Integer[]  integers = new Integer[hs.size()];
        Iterator iterator = hs.iterator();
        for (int i = 0; i < integers.length; i++) {
            integers[i] = (Integer) iterator.next();
        }

        return integers;
    }
}
