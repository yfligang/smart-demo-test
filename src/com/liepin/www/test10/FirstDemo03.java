package com.liepin.www.test10;

public class FirstDemo03 {
    //私有成员变量
    private String name;
    private int age;
    private boolean choose;

    //给私有成员变量创建获取和设置的方法
    public void setName(String str){
        name = str;
        System.out.println(name);
    }

    public String getName(){
        System.out.println(name);
        return name;
    }

    public void setAge(int num){
        age = num;
        System.out.println(age);
    }

    public int getAge(){
        return age;
    }

    public void setChoose(boolean bl){
        choose = bl;
        System.out.println(choose);
    }

    public boolean isChoose(){
        return choose;
    }


}
