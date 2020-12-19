package demo04;

public class Demo04Main {

    public static void main(String[] args){
        //对象的向上转型，就是: 父类引用指向子类对象

        Animal animal = new Cat();
        //执行看右边 new 调用子类的方法
        animal.eat();



        //判断对象的向下转型 对象名 instanceOf 类名称

        System.out.println(animal instanceof Dog);

        //giveMeAPet(animal);
        giveMeAPet(new Dog()); //Animal animal = new Dog();
    }
    //给这个方法穿进去一个动物，随便都行
    public static void giveMeAPet(Animal animal){
        if (animal instanceof Dog){  //true
            animal.eat();
        }

        if (animal instanceof Cat){
            animal.eat();
        }

    }
}
