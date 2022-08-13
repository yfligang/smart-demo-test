package study;

public class Learn0002 {
    //split

    public static void main(String[] args){
        //testSplit();
        //testSplitUpdate01();
        testSplitUpdate02();
    }

    public static void testSplit(){
        String s = "boo:and:foo";

        String[] strArray = s.split(":");
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }

    }

    public static void testSplitUpdate01(){
        String s = "boo:and:foo";

        String[] strArray = s.split(":",2);
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
    }

    public static void testSplitUpdate02(){
        String s = "boo:and:foo";

        String[] strArray = s.split("o",2);
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
    }
}
