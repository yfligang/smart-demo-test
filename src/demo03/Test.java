package demo03;
//父类中有method方法，子类中也有method方法
public class Test {

    public static void main(String[] args){
        //使用多态
        Fu fu = new Zi();
        fu.method(); //调用的是子类中的method方法
        fu.methodA();
        //编译看左边，运行看右边
        /*
        fu.methodZi(); 使用多态时，需要先看左边父类中有没有这个方法，如果没有，编译报错。
        如果父类有，运行时就需要看右边，看子类中有没有这个方法。如果父类有方法A，子类也有方法A
        则优先调用子类
         */
        System.out.println(fu.num);
        //如果想使用多态来调用父类中的方法

        Zi zi = (Zi)fu;
        zi.methodZi();



    }
}
