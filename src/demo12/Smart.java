package demo12;

import com.sun.codemodel.internal.JMethod;

public class Smart {
    //方法的重载 方法名一样，参数类型/个数不同
    public void method(int x,int y){
        System.out.println(x + y);
    }

    public void method(int x,int y,int z){
        System.out.println(x + y + z);
    }

    public void method(double x,int y){
        System.out.println(x + y);
    }

    public int method(int x,float y){
        System.out.println(x + y);
        float z = x + y;
        return (int)z;
    }

    public static void method(int x){
        System.out.println(x);
    }


}
