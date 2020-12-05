package demo02;
//接口对应的实现类
public class DemoInterfaceClass implements DemoInterface {

    @Override
    public void method01() {
        System.out.println("实现类完成对接口中的方法的重载");
    }

    @Override
    public void method02() {
        System.out.println("实现类完成对接口中的方法的重载");
    }

    //再创建类来继承该实现类
}
