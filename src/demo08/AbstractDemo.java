package demo08;
//抽象类中包含正常方法和抽象方法
public abstract class AbstractDemo {
    //抽象类也可以继承
    public abstract void method(); //抽象方法

    public void method(int num){
        System.out.println("传入的数值为 " + num);
    }
}
