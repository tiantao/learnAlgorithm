package com.tiantao.learn.LeetCode;

import java.util.HashSet;

/**
 * Created by tiantao on 2018/2/8.
 */
public class Solution {

    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        int length = subStringLength(s);
        if (length < 3){
            return length;
        }else {
            int startNum = (length)/2;
            result = findMax(s, startNum);
            if (result >= startNum){
                return result;
            }else {
                return findMin(s,startNum);
            }
        }

    }

    public int findMax(String s,int subSize){

        for (int i = 0 ; i < s.length() - subSize; i ++){
            String testStr = s.substring(i,i + subSize);
            if (subStringLength(testStr) == subSize){
                if (s.length() - subSize == 0){
                    return subSize;
                }
                return findMax(s,subSize + 1);
            }
        }
        return (subSize - 1);
    }

    public int findMin(String s,int subSize){
        for (int i = 0 ; i < s.length() - subSize; i ++){
            String testStr = s.substring(i,i + subSize);
            if (subStringLength(testStr) == subSize){
                return subSize;
            }
        }
        return findMin(s, subSize -1);
    }

    public int subStringLength(String s){
        HashSet chars = new HashSet();
        for (char c : s.toCharArray()){
            chars.add(Character.valueOf(c));
        }
        return chars.size();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring("abcd"));
    }
}
