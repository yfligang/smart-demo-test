package demo11;

public interface MyInterface {
    public void method();

    public void method(int age);

    public void method(String name);

    default void method(int age,String name){
        System.out.println("接口中的方法对应的 " + age + " " + name);
    }
}
