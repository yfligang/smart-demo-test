package com.liepin.www.test08;
//创建线程方式二
public class MyThreadRunnnable implements Runnable {

    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("方式二-->" + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
