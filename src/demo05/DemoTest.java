package demo05;
//测试类
public class DemoTest {

    public static void main(String[] args){
        //使用多态
        Father ft1 = new Son();  //编译看左边，运行看右边
        ft1.method(); //调用的是子类中的method方法
        ft1.methodA(); //如果父类和子类都有， 运行子类中的方法 如果父类有子类没有，运行父类中的方法 如果父类没有，子类有，没法调用
        //需要像 ((Son) ft1).methodE(); 这样来调用
        ft1.methodC();
        ft1.methodD();
        ft1.methodB();
        ((Son) ft1).methodE();  // (类名称) 对象名
        System.out.println("===================>");

        Father ft2 = new Daughter();

        int num1 = 100;
        System.out.println(num1);
        num1 = 200;
        System.out.println(num1);

        final int num2 = 200;
        System.out.println(num2);
        //修改final num2的值
        //num2 = 300;
    }
}
