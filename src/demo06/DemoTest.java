package demo06;

public class DemoTest {


    public static void main(String[] args) {
        //匿名内部类
        MyInterface mi = new MyInterface() {
            @Override
            public void method() {
                System.out.println("方法中的匿名内部类");
            }
        };

        mi.method();

        MyInterfaceImpl myInterface = new MyInterfaceImpl();
    }
}
