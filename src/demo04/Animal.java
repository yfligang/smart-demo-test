package demo04;

public abstract class Animal {
    //父类抽象方法
    public abstract void eat();
    //抽象类中可以有final方法和抽象方法
    public final void method(){
        System.out.println("该方法不能被子类重写");
    }

}
