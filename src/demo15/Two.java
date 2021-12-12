package demo15;

public class Two {
    /*
    数组元素的反转:
    要求是在同一个数组中
    本来的样子: [1,2,3,4]
    之后的样子: [4,3,2,1]
     */

    public static void firstMethod(int[] array){
        int temp = 0;
        for (int i = 0; i < array.length/2; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println("被交换后的数组为: ");
        for (int num:array
             ) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args){
        int[] array = new int[]{1,2,3,4};
        firstMethod(array);
    }
}
