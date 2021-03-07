package demo08;

public class Shu implements School {
    //需要实现接口School中的method方法
    @Override
    public void method(){
        System.out.println("实现接口School中的method方法");
    }

    @Override
    public int method(int age) {
        System.out.println(age);
        return age;
    }
}
