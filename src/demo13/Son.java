package demo13;

public class Son extends Mother {

    public static void main(String[] args){
        System.out.println("子类");
    }

    @Override
    int max() {
        return 0;
    }

    //普通类可以继承抽象类，需要实现抽象类中的抽象方法;如果直接是抽象类，就可以直接继承
}
