package demo14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IhashMap {

    //多个key-value值取出后加入到arraylist中
    public static void main(String[] args){
        IhashMap im = new IhashMap();
        //调用实现方法
        im.method();
    }

    public void method(){
        /*
        1.id = 1,name = LG
        2.id = 2,name = WBD
        3.id = 3,name = RNM
         */
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"LG");
        map.put(2,"WBD");
        map.put(3,"RNM");

        List list = new ArrayList();

        //循环取出map中的所有value值
        for (String str:map.values()
             ) {
            System.out.println(str);
            list.add(str);
        }

        System.out.println("=====分隔符======");

        //循环取出list中的所有value值
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }

}
