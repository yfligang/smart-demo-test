package demo11;

public class MyInterfaceImpl implements MyInterface {

    @Override
    public void method() {
        System.out.println("接口中的无参method方法");
    }

    @Override
    public void method(int age) {
        System.out.println("接口中传入的参数==>年龄 " + age + " 方法");
    }

    @Override
    public void method(String name) {
        System.out.println("接口中传入的参数==>姓名 " + name + " 方法");
    }

//    @Override
//    public void method(int age, String name) {
//        System.out.println("接口中传入的参数年龄 " + age + "姓名 " +name + "的方法" );
//    }


}
