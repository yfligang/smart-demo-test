package demo01.demo03;

public class Demo01Anonymous {

    public static void main(String[] args){
        //左边的one就是对象的名字
        Person one = new Person();
        one.name = "高圆圆";
        one.showName();
        //匿名对象
        new Person().name = "赵又廷";
        new Person().showName();
    }

}
