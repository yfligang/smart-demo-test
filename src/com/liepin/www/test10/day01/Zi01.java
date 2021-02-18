package com.liepin.www.test10.day01;

public class Zi01 extends Fu01 {

    @Override
    public String getName() {
        //System.out.println("子类" + super.getName());
        return super.getName();
    }

    @Override
    public int getAge() {
        //System.out.println("子类" + super.getAge());
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
}
