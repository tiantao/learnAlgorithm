package com.tiantao.learn.LeetCode;

/**
 * Created by tiantao on 2018/3/21.
 */
public class String2Integer {
    public int myAtoi(String str) {

        int result = 0;
        boolean negative = false;
        str = str.replaceAll(" ","");
        if (str.startsWith("-")) {
            negative = true;
            str = str.substring(1);
        } else if (str.startsWith("+")){
            str = str.substring(1);
        }
        if (str == null) {
            return 0;
        }
        if (str.length() == 0) {
            return 0;
        }

        for (int i = 0; i < str.length(); i++) {
            try {
                int num = Character.digit(str.charAt(i), 10);
                System.out.println(num);
                if (num >= 0){
                    if (i > 0) {
                        result *= 10;
                    }
                    result += num;
                }else {
                    return result;
                }

            } catch (Exception e) {
                return result;
            }
        }

        return negative ? result *-1 : result;
    }


    public static void main(String[] args) {
        String2Integer string2Integer = new String2Integer();
        System.out.println(string2Integer.myAtoi("2147483648"));
    }
}
