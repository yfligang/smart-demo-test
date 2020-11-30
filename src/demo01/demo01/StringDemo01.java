package demo01.demo01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringDemo01 {
    /*
    输入一个句子，查找出句子中包含 Exception的单词和个数
    qqqException 123ws 667781 Exception123 cool HelloWorld 89178Ex coolExceptionEEE
     */

    public static void main(String[] args){
        System.out.println("请输入句子");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toString();
        System.out.println(str);
        //将字符串转换为字符串数组

        String[] array = str.split(" ");
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i].contains("Exception")){
                map.put(array[i],1);
            }
        }

        System.out.println(map);

    }

}
