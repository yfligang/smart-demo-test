package com.liepin.www;

public class Cool extends Demo {

//    public Cool(){
//        System.out.println("Cool");
//    }
//
//    public void Demo(){
//        System.out.println("Cool");
//    }

    //对父类方法进行重写
    public void demo(){
        System.out.println("对父类demo方法重写");
    }

    public static void main(String[] args){
//        Cool cool = new Cool();
//        cool.demo();
        Demo demo = new Cool();
        demo.demo();
    }
}
