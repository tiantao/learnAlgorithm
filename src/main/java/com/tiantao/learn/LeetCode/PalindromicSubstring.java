package com.tiantao.learn.LeetCode;

/**
 * Created by tiantao on 2018/2/26.
 * Given a string s, find the longest palindromic(可逆) substring in s. You may assume that the maximum length of s is 1000.
 * Example:
 *  Input: "babad"
 *  Output: "bab"
 *  Note: "aba" is also a valid answer.
 */
public class PalindromicSubstring {
    public String longestPalindrome(String s) {

        String result = "";
        if (s.length() < 2) {
            return s;
        }

        String okStr = "";

        int start = 0;

        for (int ii = 0; ii < s.toCharArray().length; ii++) {
            if (okStr.indexOf(s.charAt(ii)) < 0) {
                start = ii;
                okStr += String.valueOf(s.charAt(start));
                for (int i = start + 1; i < s.toCharArray().length; i++) {
                    if (s.charAt(start) == s.charAt(i) && (i - start) >= result.length()) {
                        result = s.substring(start, i + 1);
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        PalindromicSubstring palindromicSubstring = new PalindromicSubstring();
        String subStr = palindromicSubstring.longestPalindrome("abcda");
        System.out.println(subStr);
    }
}
