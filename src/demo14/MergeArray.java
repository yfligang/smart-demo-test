package demo14;

import java.util.ArrayList;
import java.util.List;

public class MergeArray {

    public void method(String str1,String str2){
        StringBuilder sb3 = new StringBuilder(str1);
        StringBuffer sb4 = new StringBuffer(str2);
        System.out.println(sb3);
        System.out.println(sb4);
        System.out.println(sb3.equals("Hello"));
    }

    public void cool(String A,String B,String C){
        List<String> list1 = new ArrayList<>();
        list1.add(A);
        list1.add(B);
        list1.add(C);

        for (String str:list1
             ) {
            System.out.println(str);
        }
    }

    public static void main(String[] args){
        StringBuffer sb1 = new StringBuffer(10);
        StringBuilder sb2 = new StringBuilder(10);
        boolean bl1 = sb1.equals(sb2);
        System.out.println(bl1);
        MergeArray ma = new MergeArray();
        ma.method("Hello","World");

        ma.cool("1","2","3");
    }
}
