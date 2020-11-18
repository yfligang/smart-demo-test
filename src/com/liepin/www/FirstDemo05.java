package com.liepin.www;

public class FirstDemo05 {

    public static void main(String[] args){
//        FirstDemo03 fd = new FirstDemo03();
//        fd.setName("LG");
//        fd.getName();

        FirstDemo04 fd1 = new FirstDemo04();
        //获取不到private成员变量
        fd1.getAge(); //默认为0
        fd1.setAge(37);
        System.out.println("===============");
        FirstDemo04 fd2 = new FirstDemo04();
        fd2.setAge(38);
        fd2.setName("巴乔");
        System.out.println(fd2.getName() + fd2.getAge());
    }
}
