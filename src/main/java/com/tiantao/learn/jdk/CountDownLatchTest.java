package com.tiantao.learn.jdk;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * Created by tiantao on 2018/5/14.
 */
public class CountDownLatchTest {

    public static void main(String[] args) {
        final CountDownLatch latch = new CountDownLatch(2);

        new Thread(){

            public void run(){
                try {
                    System.out.println("等我三秒");
                    Thread.sleep(3000);
                    latch.countDown();
                    System.out.println("三秒到了");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }.start();

        new Thread(){

            public void run(){
                try {
                    System.out.println("等我两秒");
                    Thread.sleep(2000);
                    latch.countDown();
                    System.out.println("两秒到了");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }.start();

        try {
            latch.await(1, TimeUnit.SECONDS);
            System.out.println("不等...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
