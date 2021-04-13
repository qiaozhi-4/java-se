package day0402.demo03;

public class Demo03Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.show();

        person.name = "乔治";
       // person.age = 18;//直接访问private内容，错误写法!
        person.setAge(20);
        person.show();
    }
}
