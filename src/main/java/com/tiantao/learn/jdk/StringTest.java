package com.tiantao.learn.jdk;

/**
 * Created by tiantao on 2018/6/13.
 */
public class StringTest
{
    public static void main(String[] args) {
        //49
        System.out.println("1".hashCode());

        //49 * 31 + 49 = 1568
        System.out.println("11".hashCode());

        //49 * 31 * 31 + 49 * 31  + 49 = 48657
        System.out.println("111".hashCode());

        //49 * 31 * 31 + 50 * 31  + 51 = 48690
        System.out.println("123".hashCode());

    }

    public static int hashCode(String value) {
        int h = 0;
        if (h == 0 && value.length() > 0) {
            char val[] = value.toCharArray();

            for (int i = 0; i < value.length(); i++) {
                System.out.println(val[i] * 1);
                //System.out.println(h);
                System.out.println(String.valueOf(31*h));
                h = 31 * h + val[i];
            }
        }
        return h;
    }
}
