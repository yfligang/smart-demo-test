package com.liepin.www.test10.day01;

public class Fu01 {

    private String name;
    private int age;

    public String getName() {
        System.out.println("父类" + name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        System.out.println("父类" + age);
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
