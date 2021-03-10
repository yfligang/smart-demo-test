package demo09;

public class MyInterImpl implements MyInter {

    @Override
    public void method() {

    }

    @Override
    public void method(int age) {

    }

    public static void main(String[] args){
        MyInter.method("Hello"); //直接使用接口名称.方法名称来调用普通方法
    }
}
