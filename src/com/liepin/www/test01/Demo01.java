package com.liepin.www.test01;

import java.util.ArrayList;
import java.util.Random;

/*
  一个句子包含很多单词，找出包含有 Exception的单词，并算出有多少个
 */
public class Demo01 {
    public static final String str = "01Exception ex 666 Exceptionecx helloworld herowException 101Exception099";

    public static void main(String[] args){
        ArrayList<String> array = new ArrayList<>();
        String[] arrayString = str.split(" ");
        for (int i = 0; i < arrayString.length; i++) {
            array.add(arrayString[i]);
        }
        System.out.println(array);
        
    }
}
