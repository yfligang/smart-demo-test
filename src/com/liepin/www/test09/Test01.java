package com.liepin.www.test09;

public class Test01 {

    public static void main(String[] args){
        Fu fu = new Fu();
        fu.method();
        test(fu);
    }

    public static void test(Fu fu){
        System.out.println(fu);
    }

}
