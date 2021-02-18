package com.liepin.www.test08;

public class ThreadTest {

    public static void main(String[] args){
        //实例化MyThread类
        MyThread t1 = new MyThread();
        t1.run();

        //实例化ThreadTest类
        MyThreadRunnnable t2 = new MyThreadRunnnable();
        t2.run();

    }
}
