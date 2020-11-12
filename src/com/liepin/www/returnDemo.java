package com.liepin.www;

public class returnDemo {
    //定义方法，求出两个数字之和
    /*
    如果是没有返回值的，不需要使用数据类型来修饰方法名
    如果有返回值，需要使用数据类型来修饰返回值

     */
    public static void main(String[] args){
        sum(10,20);
        sum(1.0,2.0);
    }
    public static void sum(int a, int b){
        System.out.println(a + b);
    }

    public static double sum(double x,double y){
        double c = x + y;
        System.out.println(c);
        return c;
    }
}
