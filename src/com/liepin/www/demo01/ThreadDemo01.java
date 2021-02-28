package com.liepin.www.demo01;

public class ThreadDemo01 extends Thread implements Runnable {

    public ThreadDemo01(){
        System.out.println("无参构造函数");
        run();
        System.out.println("-------------------------------");
    }



    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getId() + " " + i);
        }
    }

    public void run(int num){
        for (int i = 0; i < num; i++) {
            System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getId() + " " + i);
        }
    }

    static class InnnerThreadDemo extends Thread {
        @Override
        public void run(){
            System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getId());
        }
    }

    public static void main(String[] args){
        InnnerThreadDemo itd = new InnnerThreadDemo();
        itd.run();

    }
}
