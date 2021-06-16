package demo13;

public abstract class Mother {
    //如果是普通方法，需要有方法体
    public void method(){
        System.out.println("抽象类中普通方法需要有方法体");
    }
    //如果是抽象方法，需要加上abstract
    abstract int max();
    //普通方法有返回值
    public String name(){
        System.out.println("cool");
        return "happy";
    }
}
