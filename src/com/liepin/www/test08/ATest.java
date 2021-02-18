package com.liepin.www.test08;

public class ATest {
    //成员变量
    private int age;
    private String name;
    //无参构造方法
    public ATest(){
        System.out.println("快乐~");
    }
    //有参构造方法

    public ATest(int age, String name) {
        this.age = age;
        this.name = name;
    }

    //成员方法
    public void eat(){
        System.out.println(age + " " + name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
