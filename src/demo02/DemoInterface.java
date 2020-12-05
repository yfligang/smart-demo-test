package demo02;
/*
  创建一个接口，包含抽象方法
 */
public interface DemoInterface {
    //创建两个抽象方法,需要创建一个接口的实现类来实现接口中的抽象方法
    public abstract void method01();

    public abstract void method02();

    public default void method03(){
        System.out.println("接口的默认方法使用");
    }

    //public abstract void method04();



}
