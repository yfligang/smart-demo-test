package demo01;

import java.util.Scanner;

public class ScannerDemo02 {
    //键盘输入3个数字，并求出最大值
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字: ");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字: ");
        int b = sc.nextInt();
        System.out.println("请输入第三个数字: ");
        int c = sc.nextInt();
        //求出这三个数字中的最大值 想使用数组的方法来实现
        int[] array = new int[3];
        array[0] = a;
        array[1] = b;
        array[2] = c;

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= max){
                max = array[i];
            }
        }
        System.out.println("3个数中最大的值为: " + max);

    }
}
