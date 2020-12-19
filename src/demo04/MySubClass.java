package demo04;

import demo03.Fu;

public final class MySubClass extends Fu {

    public static void main(String[] args){
        System.out.println("不能被继承");

        Fu fu = new MySubClass();
        fu.method();
    }
}
