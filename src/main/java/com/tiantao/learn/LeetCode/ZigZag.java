package com.tiantao.learn.LeetCode;

/**
 * Created by tiantao on 2018/3/6.
 */
public class ZigZag {

    public String convert(String s, int numRows) {

        if (numRows == 1){
            return s;
        }
        char[] str = new char[s.length()];
        int ii = 0;
        for(int i = 0 ; i < numRows; i ++){
            for(int j = i ,x = numRows; j < s.length(); j += numRows*2 - 2,x += numRows*2 - 2){
                str[ii] = s.charAt(j);
                ii ++;
                int temp =x + (numRows - 2  - i);
                if ( temp < s.length() && i != 0 && i != numRows - 1){
                    str[ii] = s.charAt(temp);
                    ii ++;
                }
            }
        }
        return String.copyValueOf(str);
    }

    public static void main(String[] args) {
        ZigZag zigZag = new ZigZag();
        System.out.println(zigZag.convert("PAYPALISHIRING",3));
    }
}
