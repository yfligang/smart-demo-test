package com.liepin.www;

import com.sun.prism.impl.shape.BasicRoundRectRep;

public class FirstDemo01 {

    //类的构造方法在主方法外，方法中不能嵌套方法。构造方法不需要返回值(return)
    //无参构造方法
    public FirstDemo01(){
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("无参构造方法: " + c);
    }

    //有参构造方法
    public FirstDemo01(int x){
        int y = x;
        System.out.println("有参构造方法: " + y);
    }

    public FirstDemo01(int x,int y){
        int z = x + y;
    }

    //没有返回值的方法
    public void test01(){
        double a = 1.0;
        double b = 2.0;
        double c = a + b;
        System.out.println("方法test01的值 " + c);
    }

    //有返回值的方法
    public String test02(){
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + str2;
        System.out.println("test02的返回值为: " + str3);
        return str3;
    }

    public static void main(String[] args){
        //类的实例化，会调用类的构造方法
        FirstDemo01 fd = new FirstDemo01(); //无参构造方法: 30
        //如果有无参构造方法，类的实力化不会调用有参构造方法.如果实力化时带参数，会调用带参数的方法
        FirstDemo01 fd1 = new FirstDemo01(100);
        FirstDemo01 fd2 = new FirstDemo01(10,11);
        int[] array = {1,4,15,77,99};
        fd.reverse(array);
        fd.reverse01(array);
    }

    //数组反转，写一个方法来进行数组反转
    public void reverse(int[] array){
        int[] array1 = array;
        //新建一个数组，将原数组中从最后的元素到第一个元素，赋值给新的数组
        int[] array2 = new int[array1.length];
        int j = array1.length;
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[j -1];
            j--;
        }
        for (int num:array2
             ) {
            System.out.println(num);
        }

        System.out.println("======================");
    }



    //数组反转，不创建新数组，在原有数组的基础上进行反转
    public void reverse01(int[] array){
        int[] array1 = array;

        int j = array1.length;
        for (int i = 0; i < array1.length; i++) {
            array1[i] = array1[j-1];
            j--;
        }
        for (int num:array1
             ) {
            System.out.println(num);
        }
    }
}
