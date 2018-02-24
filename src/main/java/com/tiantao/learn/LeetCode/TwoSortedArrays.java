package com.tiantao.learn.LeetCode;

/**
 * Created by tiantao on 2018/2/24.
 */
public class TwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] nums = new int[m + n];
        int breakNum = nums.length / 2;
        int x = 0;
        for (int i = 0, j = 0  ; x <= breakNum;){

            if (i == nums1.length){
                for (;j < nums2.length && x <= breakNum; j ++){
                    nums[x] = nums2[j];
                    x ++;
                }
                break;
            }
            if (j == nums2.length){
                for (;i < nums1.length && x <= breakNum; i++){
                    nums[x] = nums1[i];
                    x ++;
                }
                break;
            }

            if (nums1[i] <= nums2[j]){
                nums[x] = nums1[i];
                i ++;
            }else {
                nums[x] = nums2[j];
                j ++;
            }
            x ++;
        }

        if (nums.length % 2 == 0){
            return (Double.valueOf(nums[breakNum] + nums[breakNum -1])) /2;
        }else {
            return nums[breakNum];
        }

    }

    public static void main(String[] args) {
        TwoSortedArrays twoSortedArrays = new TwoSortedArrays();

        int[] nums1 = {};
        int[] nums2 = {6};

        double d  = twoSortedArrays.findMedianSortedArrays(nums1,nums2);
        System.out.println(d);
    }
}
