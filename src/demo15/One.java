package demo15;

public class One {
    /*
    数组元素的反转:
    要求是在同一个数组中
    本来的样子: [1,2,3,4]
    之后的样子: [4,3,2,1]
     */

     public static void firstMethod(int[] array){
         //如果是使用一个新的数组
         int[] newArray = new int[array.length];
         if (array.length == 0){
             System.out.println("请勿输入空数组，请重新输入");
             return;
         }
         for (int i = 0; i < array.length; i++) {
            newArray[i] = array[array.length-1-i];
         }

         System.out.print("新的数组为: ");
         for (int num:newArray
              ) {
             System.out.print(num + " ");
         }
     }

     public static void main(String[] args){
         //将数组作为参数传入进去，但是需要 new一个
         firstMethod(new int[]{1,2,3,4});
     }

}
