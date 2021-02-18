package com.liepin.www.test10.day01;

public class OverloadClass {

    public static void main(String[] args){
        sum(1,2);
        sum(1,2,3);

        OverloadClass olc = new OverloadClass();
        olc.sum(1,2,3,4);
    }

    //方法的重载 2个参数
    public static int sum(int a, int b){
        int sum = a + b;
        System.out.println(sum);
        return sum;
    }

    //方法的重载 3个参数
    public static int sum(int a,int b,int c){
        int sum = a + b + c;
        System.out.println(sum);
        return sum;
    }

    //方法的重载 4个参数---不使用静态方法
    public void sum(int a,int b,int c,int d){
        int sum = a + b + c + d;
        System.out.println(sum);
    }
}
