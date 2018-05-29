package com.tiantao.learn.LeetCode;

/**
 * Created by tiantao on 2018/3/6.
 */
public class ReverseInteger {
    public int reverse(int x) {
        boolean isMinus = false;
        if (x < 10 && x > -10) {
            return x;
        } else if (x <= -10) {
            isMinus = true;
        }

        String str = String.valueOf(x);

        if (str.startsWith("-")){
            str = str.substring(1);
        }

        char[] chars = str.toCharArray();
        char[] result = null;
        for (int i = chars.length - 1; i >= 0; i--) {

            if (chars[i] == '0' && result == null) {
                continue;
            }
            if (result == null) {
                result = new char[i + 1];
            }
            result[result.length - (i + 1)] = chars[i];
        }

        Long l = Long.valueOf(String.copyValueOf(result));

        if (l > Integer.MAX_VALUE){
            x = 0;
        }else {
            x = Integer.valueOf(String.copyValueOf(result));
        }
        if (isMinus) {
            x = x * -1;
        }



        return x;

    }

    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
        System.out.println(reverseInteger.reverse(-2147483648));
    }
}
