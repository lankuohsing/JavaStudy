package com.languoxing.MultiThreadStudy;

public class ThreadSleepTester {
    public static void main(String[] args) {
        //创建并命名每个线程
        TestThread thread1 = new TestThread("thread1");
        TestThread thread2 = new TestThread("thread2");
        TestThread thread3 = new TestThread("thread3");
        System.out.println("Starting threads");
        thread1.start();
        thread2.start();
        thread3.start();
        System.out.println("Threads started, main ends");
    }
}
