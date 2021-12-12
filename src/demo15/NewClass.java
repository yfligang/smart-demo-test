package demo15;

import sun.lwawt.macosx.CSystemTray;

import java.util.*;

public class NewClass {
    //从1~10,随机生成N个数，找到出现重复次数最多的数和重复的次数

    public static void getNums(int num1,int num2){
        //num1为，随机生成从1～num1的数
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < num2; i++) {
//            if (num2 == 0 && num2 < 0){
//                System.out.println("输入的数字必须大于0");
//                return;
//            }
//            if (num1 == 0 && num1 < 0){
//                System.out.println("输入的数字必须大于0");
//                return;
            arrayList.add(random.nextInt(num1));
        }
        //打印下集合的内容
        for (int num:arrayList
             ) {
            System.out.print(num + " ");
        }

        //开始查找重复出现的数字和次数
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < num2 ; i++) {
            if (hashMap.containsKey(arrayList.get(i)) == false){
                hashMap.put(arrayList.get(i),1);
            }else {
                hashMap.put(arrayList.get(i),hashMap.get(arrayList.get(i)) + 1);
            }
        }

        //打印hashmap
        System.out.print(hashMap + " ");

        //怎么从HashMap中找到判断value的最大值和对应的key值
//        Set<Integer> num3 = hashMap.keySet();
//        System.out.println(num3);

        int num04 = hashMap.values().iterator().next();
        System.out.println(num04);

    }

    public static void main(String[] args){
        getNums(5,5);
    }


}
