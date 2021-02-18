package com.liepin.www.test09;

public class Zi extends Fu {

    public Zi(){
        new Zi(100);
        System.out.println("Hello");
    }

    public Zi(int age){
        super.method();
        this.method();
        System.out.println(age);
    }


}
