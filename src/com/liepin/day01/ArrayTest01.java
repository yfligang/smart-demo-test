package com.liepin.day01;


import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

import java.util.Random;

public class ArrayTest01 {
    private static int id;
    private static String name;

    public void random01(){
        int id = RandomUtils.nextInt(20,100);
        this.id = id;
        String name = RandomStringUtils.random(1);
        this.name = name;
    }

    public void method(int id,String name){
        id = this.id;
        name = this.name;
        System.out.println(id);
        System.out.println(name);
    }

    public static void main(String[] args){
        ArrayTest01 at = new ArrayTest01();
        at.random01();
        at.method(id,name);
    }
}
