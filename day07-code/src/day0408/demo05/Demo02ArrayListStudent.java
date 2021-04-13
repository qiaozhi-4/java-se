package day0408.demo05;
/*
题目:
自定义4个学生对象，添加到集合，并遍历。
思路:
1．自定义Student学生类,四个部分。
2．创建一个集合，用来存储学生对象。泛型:<Student>3．根据类,创建4个学生对象。
4．将4个学生对象添加到集合中: add
5．遍历集合:for、size、get

 */
import java.util.ArrayList;

public class Demo02ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student studentA = new Student("乔治",8);
        Student studentB = new Student("佩奇",12);
        Student studentC = new Student("汤姆",14);
        Student studentD = new Student("杰瑞",10);

        list.add(studentA);
        list.add(studentB);
        list.add(studentC);
        list.add(studentD);

        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("姓名：" + stu.getName() + " 年龄：" + stu.getAge());

        }
    }
}
