package demo05;

public class Father implements InterfaceMother {

    @Override
    public void method() {
        System.out.println("父类方法重写Method");
    }

    @Override
    public void methodA() {
        System.out.println("父类方法重写MethodA");
    }

    @Override
    public void methodC() {
        System.out.println("父类方法重写MethodC");
    }

    @Override
    public void methodD() {
        System.out.println("父类方法重写MethodD");
    }
}
