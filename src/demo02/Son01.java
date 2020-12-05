package demo02;

public class Son01 extends DemoInterfaceClass {

    @Override
    public void method01() {
        super.method01();
        System.out.println("对Son01类中的method01方法进行重载");
    }

    @Override
    public void method02() {
        super.method02();
    }
}
