package com.liepin.www.test10;

public class FirstDemo04 {
    //定义成员变量
    private String name;
    private int age;
    private static String str = "Cool";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        System.out.println(age);
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        //System.out.println(age);
    }

    public static String getStr() {
        return str;
    }

    public static void setStr(String str) {
        FirstDemo04.str = str;
    }

    public static void main(String[] args) {

    }
}
