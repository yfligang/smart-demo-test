package demo07;

public class Foo {

    public static void main(String[] args) throws ClassNotFoundException {
        Foo fo = new Foo();
        //方式一
        Class c1 = Foo.class;
        //方式二
        Class c2 = fo.getClass();
        //判断Foo的类类型是否相同  都是Foo类的类类型
        System.out.println(c1 == c2);

        Class c3 = Class.forName("demo07.Foo");
        System.out.println(c3);
        System.out.println(c3 == c1);

        Class c4 = int.class; //int的类类型
        System.out.println(c4);

        Class c5 = String.class; //String的类类型
        System.out.println(c5);

        try {
            //强制类型转换
            Foo foo = (Foo)c1.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }


}
