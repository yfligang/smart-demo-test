package com.liepin.day02;

import java.util.Scanner;

public class One {
    //使用switch把小写类型的 char型转为大写(键盘输入) 只转换a,b,c,d,e 其他的输入 "other"

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要转为大写的字母: ");
        char ca = scanner.next().charAt(0);
        switch (ca){
            case 'a':
                System.out.println('A');
                break;
            case 'b':
                System.out.println('B');
                break;
            case 'c':
                System.out.println('C');
                break;
            case 'd':
                System.out.println('D');
                break;
            case 'e':
                System.out.println('E');
                break;
            default:
                System.out.println("other");

        }

    }
}
