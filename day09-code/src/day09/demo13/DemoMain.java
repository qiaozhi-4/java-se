package day09.demo13;

public class DemoMain {

    public static void main(String[] args) {
//        Animal animal = new Animal;//错误，这是抽象类

//        Dog dog = new Dog;//错误这也是，抽象类

        Dog2Ha dog2Ha = new Dog2Ha();
        dog2Ha.eat();
        dog2Ha.sleep();
        System.out.println("=======");

        DogGolden dogGolden = new DogGolden();
        dogGolden.eat();
        dogGolden.sleep();

    }

}
