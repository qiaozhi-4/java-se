package day0408.demo02;

import java.util.Scanner;

public class Demo02Anonymous {
    public static void main(String[] args) {

        //使用匿名对象来进行传参
        methodParam(new Scanner(System.in));
    }

    public static void methodParam(Scanner sc){
        System.out.println("请输入一个整数：");
        int num = sc.nextInt();
        System.out.println("输入的是：" + num);
    }
}
