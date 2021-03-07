package demo08;

public class Test {

    public Test(){
        Shu shu = new Shu();
        shu.method();
        shu.method(100);
    }

    public static void main(String[] args){
        Test test = new Test();
        //父类实现父类的对象
        Fu fu = new Fu();
        int num1 = fu.age;
        System.out.println("num1= " + num1);
        fu.method();
        //子类实现父类的对象
        Fu fz = new Zi();
        int num2 = fz.age; //还是显示父类的成员变量
        System.out.println("num2= " + num2);
        fz.method();
        //子类实现子类的对象
        Zi zi = new Zi();
        int num3 = zi.age;
        System.out.println("num3= " + num3);
        zi.method();
        //孙类实现孙类的对象
        Sun sun = new Sun();
        int num4 = sun.age;
        System.out.println("num4=" + num4);
        //孙类实现父类的对象
        Fu fs = new Sun();
        int num5 = fs.age;
        System.out.println("num5=" + num5);
        fs.method();
        //子类实现孙类的对象
        Zi zs = new Sun();
        int num6 = zs.age;
        System.out.println("num6=" + num6);
        zs.method();
    }
}
