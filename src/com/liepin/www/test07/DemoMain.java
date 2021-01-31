package com.liepin.www.test07;

public class DemoMain {

    public static void main(String[] args){
        Hero hero = new Hero();
        hero.setName("巴乔"); //设置英雄的名称

        //设置英雄技能
        hero.setSkill(new SkillImpl());
        hero.attack();

        //还可以使用匿名内部类

        //进一步简化，同时使用匿名内部类和匿名对象
        
    }
}
