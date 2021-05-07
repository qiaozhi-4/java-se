package day10.demo06;
/*
如何才能知道一个父类引用的对象，本来是什么子类?格式:
对象instanceof类名称
这将会得到一个boolean值结果，也就是判断前面的对象能不能当做后面类型的实例。

 */
public class DemoInstanceof {

    public static void main(String[] args) {
        Animal animal = new Cat();//本来是猫
        animal.eat();//猫吃鱼

        //如果希望掉用子类特有方法，需要向下转型
        //判断一下animal本来是不是dog
        if (animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }
        //判断一下animal本来是不是cat
        if (animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }

        giveMeAPer(new Dog());
    }

    public static void giveMeAPer(Animal animal){
        //判断一下animal本来是不是dog
        if (animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }
        //判断一下animal本来是不是cat
        if (animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }
    }

}
