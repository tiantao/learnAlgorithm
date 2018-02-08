package com.tiantao.learn.algorithm.sort.algorithms;

/**
 * Created by tiantao on 2018/1/10.
 *
 * 时间复杂度为  (1+n)n/2-n
 */
public class InsertionSort implements BaseSort {


    public InsertionSort() {
    }

    public Integer[] sort(Integer[] a) {

        int num = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0 ; j < i; j ++){
                if (a[i] < a[j]){
                    Integer k = a[j];
                    a[j] = a[i];
                    a[i] = k;
                }
                num ++;
            }
        }

        System.out.println(num);

        return a;
    }
}
