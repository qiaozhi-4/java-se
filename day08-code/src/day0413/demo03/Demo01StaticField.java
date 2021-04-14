package day0413.demo03;
/*
如果一个成员变量使用了static关键字，那么这个变量不再属于对象自己，而是属于所在的类。多个对象共享同一份数据。
 */
public class Demo01StaticField {
    public static void main(String[] args) {
        Student stu1 = new Student("乔治", 18);
        stu1.room = "01号";
        System.out.println("学号：" + stu1.getId() + " 姓名：" + stu1.getName() + " 年龄：" + stu1.getAge() + " 教室：" + stu1.room);
        Student stu2 = new Student("佩奇", 16);
        System.out.println("学号：" + stu2.getId() + " 姓名：" + stu2.getName() + " 年龄：" + stu2.getAge() + " 教室：" + stu1.room);

    }
}
