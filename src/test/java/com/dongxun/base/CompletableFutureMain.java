package com.dongxun.base;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CountDownLatch;

public class CompletableFutureMain {
    public static void main(String[] args) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        // 从debug 看，1和2是同一个线程来执行
        CompletableFuture.supplyAsync(()->{ // 1 异步执行
            countDownLatch.countDown();
            return "";
        }).thenAcceptAsync((s) -> { //2 异步执行
            System.out.println(s);
        });

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
