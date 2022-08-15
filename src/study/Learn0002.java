package study;

public class Learn0002 {
    //split

    public static void main(String[] args){
        //testSplit();
        //testSplitUpdate01();
        //testSplitUpdate02();
        Learn0002 learn0002 = new Learn0002();
        learn0002.testSplit01();
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

        String[] strArray = s.split("o",4);
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
    }

    public static void testSplit01(){
        String s1 = "Hello,world!";
        String s2 = "Cool";

        String str = s1 + String.join("," + s2);
        System.out.println(str);
    }


}
