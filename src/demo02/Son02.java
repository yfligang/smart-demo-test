package demo02;

public class Son02 extends DemoInterfaceClass {

    @Override
    public void method01() {
        super.method01();
    }

    @Override
    public void method02() {
        super.method02();
        System.out.println("对Son02类中的method02方法进行重载");
    }


}
