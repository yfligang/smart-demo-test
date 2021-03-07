package com.liepin.www.test10;

import java.util.Stack;
import java.util.Vector;

//方法只能返回一个值，如果需要返回多个值，可以使用数组
public class FirstDemo02 {
    public static void main(String[] args){
        int[] result = test01(10,20);
        System.out.println(result[0]);
        System.out.println(result[1]);

        Vector<Integer> vector = new Vector<Integer>(3,2);
        vector.capacity();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.add(6);
        System.out.println(vector.size());

    }

    //方法需要返回两个值，一个是总和，一个是平均值; 入参可以是两个int 值
    public static int[] test01(int x,int y){
        int z = x + y;
        int m = z / 3;
        int[] array01 = new int[2];
        array01[0] = z;
        array01[1] = m;
        System.out.println(array01[0]);
        System.out.println(array01[1]);
        return array01;
    }
}
