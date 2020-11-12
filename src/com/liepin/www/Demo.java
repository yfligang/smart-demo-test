package com.liepin.www;

public class Demo {
    public Demo(){
        System.out.println("先运行我");
    }

    public void demo(){
        System.out.println("父类方法");
    }

    public int num(int x,int y){
        int a = x + y;
        System.out.println(a);
        return a;
    }

    public static void main(String[] args){
        Demo demo = new Demo();
        demo.demo();
        demo.num(2,2);
        System.out.println("Hello,world!");

    }



}
