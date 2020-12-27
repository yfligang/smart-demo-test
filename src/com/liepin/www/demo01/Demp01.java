package com.liepin.www.demo01;

public class Demp01 {

    public void method1(String str){
        System.out.println(str);
    }

    public void method2(Integer integer){
        System.out.println(integer);
    }

    public static void main(String[] args){
        Demp01 demp01 = new Demp01();
        demp01.method1("Hello");
        demp01.method2(1);
    }
}
