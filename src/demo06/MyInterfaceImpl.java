package demo06;

public class MyInterfaceImpl implements MyInterface {
    @Override
    public void method() {
        System.out.println("实现接口的抽象方法");
    }

    public static void main(String[] args){
        MyInterfaceImpl mifi = new MyInterfaceImpl();
        mifi.method();
    }

    public MyInterfaceImpl(){
        //装箱
        //构造方法
        Integer ini01 = new Integer(10);
        System.out.println(ini01);

        Integer ini02 = new Integer("10");
        System.out.println(ini02);

        //静态方法
        Integer ini03 = Integer.valueOf(10);
        System.out.println(ini03);

        Integer ini04 = Integer.valueOf("10");
        System.out.println(ini04);

        System.out.println("=============>");

        int i = Integer.valueOf(10);
        System.out.println(i);
    }


}
