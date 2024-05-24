// package com;
class MyThreadRunnable1 implements Runnable{
    int i=1;
    public void run(){
        System.out.println("Thread 1 Under Execution");
        System.out.println("Thread 1 Under Execution");
        System.out.println("Thread 1 Under Execution");
        System.out.println("Thread 1 Under Execution");
        System.out.println("Thread 1 Under Execution");
        System.out.println("Thread 1 Under Execution");
        System.out.println("Thread 1 Under Execution");
        System.out.println("Thread 1 Under Execution");
        System.out.println("Thread 1 Under Execution");
        System.out.println("Thread 1 Under Execution");
        System.out.println("Thread 1 Under Execution");
        System.out.println("Thread 1 Under Execution");
        System.out.println("Thread 1 Under Execution");
        System.out.println("Thread 1 Under Execution");
        System.out.println("Thread 1 Under Execution");
        System.out.println("Thread 1 Under Execution");
        System.out.println("Thread 1 Under Execution");
        System.out.println("Thread 1 Under Execution");
        System.out.println("Thread 1 Under Execution");
        System.out.println("Thread 1 Under Execution");
        System.out.println("Thread 1 Under Execution");
        System.out.println("Thread 1 Under Execution");
        System.out.println("Thread 1 Under Execution");
        System.out.println("Thread 1 Under Execution");
        System.out.println("Thread 1 Under Execution");
        System.out.println("Thread 1 Under Execution");
        System.out.println("Thread 1 Under Execution");
        System.out.println("Thread 1 Under Execution");
        System.out.println("Thread 1 Under Execution");
        System.out.println("Thread 1 Under Execution");
        System.out.println("Thread 1 Under Execution");
        System.out.println("Thread 1 Under Execution");
        System.out.println("Thread 1 Under Execution");
        System.out.println("Thread 1 Under Execution");
        System.out.println("Thread 1 Under Execution");
        System.out.println("Thread 1 Under Execution");
        System.out.println("Thread 1 Under Execution");

    }
}
class MyThreadRunnable2 implements Runnable{
    public void run(){
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");
        System.out.println("Thread 2 Under Execution");

    }
}
public class MyThreadRunnable {
    public static void main(String[] args){
        System.out.println("Threads Runnable being Tested");
        MyThreadRunnable1 bullet1 =new MyThreadRunnable1();
        Thread gun1=new Thread(bullet1);
        MyThreadRunnable2 bullet2 =new MyThreadRunnable2();
        Thread gun2=new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
