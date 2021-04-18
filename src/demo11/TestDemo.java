package demo11;

public class TestDemo {

    public static void main(String[] args){
        MyInterfaceImpl mi = new MyInterfaceImpl();
        //调用第一个无参函数的方法
        mi.method();
        mi.method(100);
        mi.method("LG");
        mi.method(37,"LS");

        System.out.println("==================");

        MyInterface mif = new MyInterfaceImpl();
        mif.method();
        mif.method(100);
        mif.method("LGLS");
        mif.method(20,"China");




    }


}
