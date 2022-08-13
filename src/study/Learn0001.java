package study;

public class Learn0001 {

    public static void main(String[] args){
        Learn0001 learn0001 = new Learn0001();
        learn0001.testReplace();
    }

    public void testReplace(){
        String str = "Hello World China ll";

        str = str.replaceFirst("l","x");
        System.out.println("replaceFirst: " + str);

        System.out.println("================");
        //replaceAll
        str = str.replaceAll("l","A");
        System.out.println("replaceAll: " + str);

        System.out.println("================");

        //replace + String
        str = str.replace("l","A");
        System.out.println("replace: " + str);

        System.out.println("================");

        str = str.replace("Ch","o");
        System.out.println("replace: " + str);
    }
}
