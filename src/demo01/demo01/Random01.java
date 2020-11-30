package demo01.demo01;

import java.util.Random;

public class Random01 {
    //随机100以内的10个数
    public static void main(String[] args){
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(100);
        }
        for (int num:array
             ) {
            System.out.println(num);
        }

    }
}
