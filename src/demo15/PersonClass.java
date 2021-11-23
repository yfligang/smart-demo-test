package demo15;

import com.sun.codemodel.internal.JArray;

public class PersonClass {
    public static void main(String[] args){
        Person person = new Person();
        method(person);
        System.out.println("=============");
        Person person1 = getPhone();
        System.out.println(person1.age);
        System.out.println(person1.name);
        //System.out.println(person1.array);
    }

    //将类的对象作为方法的参数
    public static void method(Person person){
        System.out.println(person.age); //40
    }

    //将对象类型作为方法的返回值
    public static Person getPhone(){
        Person person = new Person();
        person.age = 100;
        person.name = "LG";
        person.array = new int[]{1,2,3,4};
        for (int num: person.array
             ) {
            System.out.println(num);
        }
        return person;
    }
}
