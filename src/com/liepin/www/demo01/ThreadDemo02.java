package com.liepin.www.demo01;

public class ThreadDemo02 {

    public static void main(String[] args){
        ThreadDemo01 td1 = new ThreadDemo01();
        td1.run();
        System.out.println("==============================");
        td1.run(20);
    }
}
