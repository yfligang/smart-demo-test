package demo05;

public class Son extends Father {
    //子类Son对父类中的方法进行重写
    @Override
    public void method() {
        System.out.println("子类中的method");
    }

    public void methodE(){
        System.out.println("子类Son中独有的方法");
    }
}
