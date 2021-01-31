package com.liepin.www.test06;

public class DemoMain {

    public static void main(String[] args){
        //创建一个英雄角色
        Hero hero = new Hero();
        //为英雄起一个名字，并设置年龄
        hero.setName("罗伯特.巴乔");
        hero.setAge(36);

        //创建一个武器对象
        Weapon weapon = new Weapon("足球"); //需要有 有参的构造函数
        //为英雄配备武器
        hero.setWeapon(weapon);
        hero.attack();
    }
}
