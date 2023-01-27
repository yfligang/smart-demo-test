package study;

public class Learn0004 {
    /*
    “水仙花数”是指一个三位数，其各位数字的立方和确好等于该数本身
     如；153＝1+125+27=153，则153是一个“水仙花数“。
     */

    public static void main(String[] args){
        //水仙花数是一个三位数
        for (int i = 100; i < 1000; i++) {
            int a = i % 10; //取出个位上的数
            int b = (i / 10) % 10; //取出十位上的数
            int c = i / 100; //取出百位上的数
            int pd = a*a*a + b*b*b + c*c*c;
            if (pd == i){
                System.out.println(i);
            }
        }
    }
}
