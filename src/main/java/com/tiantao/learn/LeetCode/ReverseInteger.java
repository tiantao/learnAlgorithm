package com.tiantao.learn.LeetCode;

/**
 * Created by tiantao on 2018/3/6.
 */
public class ReverseInteger {
    public int reverse(int x) {
        System.out.println(String.valueOf(x));
        System.out.println(Integer.valueOf("-123"));
        return x;
    }

    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
        reverseInteger.reverse(-123);
    }
}
