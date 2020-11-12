package com.liepin.www;

public class NumberTest {

    public static void main(String[] args){
        int[] array1 = new int[3];
        System.out.println(array1); //堆里的地址
        System.out.println(array1[0]);
        System.out.println(array1[1]);
        System.out.println(array1[2]);

        System.out.println("================");

        int[] array2 = array1;
        System.out.println(array2);
        array1[1] = 100;
        array1[2] = 200;
        System.out.println(array2[0]);
        System.out.println(array2[1]);
        System.out.println(array2[2]);

        System.out.println("================");

        System.out.println(array1[1]);
        System.out.println(array1[2]);

        //找出数组中的最大值
        int[] array3 = {10,11,31,2,5,111,99,321,0,-187};
        int max = array3[0];
        for (int i = 1; i < array3.length; i++) {
            if (array3[i] > max){
                max = array3[i];
            }
        }
        System.out.println("最大值: " + max);

        //求最小值
        int min = array3[0];
        for (int i = 1; i < array3.length; i++) {
            if (array3[i] < min){
                min = array3[i];
            }
        }
        System.out.println("最小值：" + min);

        print(10);
    }

    //循环打印5次数据
    public static void print(int a){
        for (int i = 0; i < a; i++) {
            System.out.println("Hello,world!");
        }
    }
}
