package com.languoxing.MultiThreadStudy;

public class TestThread extends Thread {
    private int sleepTime;
    public TestThread(String name) {
        super(name);
        sleepTime = (int) (Math.random() * 600);
    }
    @Override
    public void run() {
        try {
            System.out.println(getName() + " going to sleep for " + sleepTime);
            Thread.sleep(sleepTime);
        } catch (InterruptedException exception) {
            // TODO: handle exception
        }
        System.out.println(getName() + " finished");
    }
}
