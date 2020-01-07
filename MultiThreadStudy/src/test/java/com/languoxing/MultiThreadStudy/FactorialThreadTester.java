package com.languoxing.MultiThreadStudy;

/*
 * main thread ends
 * new thread started
 * The factorial of 10 is 3628800
 * new thread end
 */
public class FactorialThreadTester {
    public static void main(String[] args) {
        System.out.println("main thread starts");
        FactorialThread thread = new FactorialThread(10);
        thread.start();
        System.out.println("main thread ends");
    }
}
