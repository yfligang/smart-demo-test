package demo01.demo03;

import java.util.Scanner;

public class ScannerDemo01 {
    //使用scanner类输入两个数字，并求这两个数字的和
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int x = sc.nextInt();
        System.out.println("请输入第二个数字");
        int y = sc.nextInt();
        int z = x + y ;
        System.out.println("输入值的和为 " + z);
    }
}
