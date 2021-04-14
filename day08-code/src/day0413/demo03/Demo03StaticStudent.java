package day0413.demo03;

public class Demo03StaticStudent {
    public static void main(String[] args) {
        //首先设置一下教室，这是静态的东西，应该通过类名称进行调用
        Student.room = "01教室";

        Student sty1 = new Student("乔治", 8);
        System.out.println("姓名：" + sty1.getName());
        System.out.println("年龄：" + sty1.getAge());
        System.out.println("教室：" + Student.room);
        System.out.println("=========");

        Student sty2 = new Student("佩奇", 6);
        System.out.println("姓名：" + sty2.getName());
        System.out.println("年龄：" + sty2.getAge());
        System.out.println("教室：" + Student.room);
    }
}
