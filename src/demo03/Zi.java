package demo03;

public class Zi extends Fu {

    int num = 20;

    @Override
    public void method() {
        System.out.println("我是子类的method方法");
    }

    //该方法只有子类有，父类没有
    public void methodZi(){
        System.out.println("该方法只有子类有，父类没有");
    }
    /*
    public void methodA(){

    }
    子类重写父类中的final方法，是不被允许的
     */

}
