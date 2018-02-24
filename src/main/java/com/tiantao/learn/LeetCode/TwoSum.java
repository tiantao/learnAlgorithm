package com.tiantao.learn.LeetCode;

/**
 * Created by tiantao on 2018/2/8.
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > target)
                continue;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] input = {3,2,4};
        int[] res = twoSum.twoSum(input,6);
        System.out.println(res[0]);
    }
}
