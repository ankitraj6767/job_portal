package com.blueyonder.day5.threads;

public class DisplayThread extends Thread {
    int number=0;
    public DisplayThread()
    {
        System.out.println("Display thread");
    }
    public DisplayThread(int n)
    {
        number=n;
        this.start();
    }

    public void run()
    {
        for(int i=1;i<=number;i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class DisplayDemo
{
    public static void main(String[] args) {
        int n=10;
        Thread t1=new DisplayThread(n);
        Thread t2=new DisplayThread(n+10);
    }
}
