package com.liepin.www.test08;

public class MyThread extends Thread {

    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("方式一-->" + i);
        }
    }
}
