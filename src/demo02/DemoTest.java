package demo02;

public class DemoTest {

    public static void main(String[] args){
        Son01 son01 = new Son01();
        son01.method01();
        son01.method02();
        son01.method03();
        System.out.println("===============>");
        Son02 son02 = new Son02();
        son02.method01();
        son02.method02();
        son02.method03();
        System.out.println("===============>");
        DemoInterfaceClass demoInterfaceClass = new DemoInterfaceClass();
        demoInterfaceClass.method01();
        demoInterfaceClass.method02();
        demoInterfaceClass.method03();
    }
}
