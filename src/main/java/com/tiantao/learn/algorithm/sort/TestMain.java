package com.tiantao.learn.algorithm.sort;

import com.tiantao.learn.algorithm.sort.algorithms.BaseSort;
import com.tiantao.learn.algorithm.sort.algorithms.InsertionSort;
import com.tiantao.learn.algorithm.sort.prepare.Prepare;

/**
 * Created by tiantao on 2018/1/10.
 */
public class TestMain {

    public static void main(String[] args) {

        Integer[]  integers = Prepare.prepareUnorderedArray(60000);

        BaseSort sort = new InsertionSort();
        Integer[] resultArray = sort.sort(integers);
/*
        for (int i = 0; i < resultArray.length; i++) {
            System.out.println(resultArray[i]);
        }*/

    }
}
