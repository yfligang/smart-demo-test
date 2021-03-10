package demo09;
//定义一个接口
public interface MyInter {
    //定义一个抽象方法
    public void method();

    //定义一个默认方法
    default void method(int age){
        System.out.println("接口MyInter的 " + age);
    }

    //定义一个普通方法
    public static String method(String name){
        System.out.println("接口MyInter的 " + name);
        return name;
    }
}
