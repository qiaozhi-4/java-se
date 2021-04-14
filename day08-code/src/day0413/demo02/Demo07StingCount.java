package day0413.demo02;
/*
题目:
键盘输入一-个字符串，并且统计其中各种字符出现的次数。
种类有:大写字母、小写字母、数字、其他
思路:
1.既然用到键盘输入，肯定是Scanner
2.键盘输入的是字符串，那么: String str = sc.next();
3.定义四个变量，分别代表四种字符各自的出现次数。
4.需要对字符串一个字、一个字检查，String-->char[],方法就是toCharArray()
5.遍历char[]字符数组，对当前字符的种类进行判断，并且用四个变量进行++动作。
6.打印输出四个变量，分别代表四种字符出现次数。
 */

import java.util.Scanner;

public class Demo07StingCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请从键盘输入一个字符串!");
        String str = sc.next();//获取键盘输入的一个字符串

        int cuntUpper = 0;//大写字母
        int cuntLower = 0;//小写字母
        int cuntNumber = 0;//数字
        int cuntOther = 0;//其他字符

        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if ('A' <= ch && ch <= 'Z'){
                cuntUpper++;
            }else if ('a' <= ch && ch <= 'z'){
                cuntLower++;
            }else if ('0' <= ch && ch <= '9'){
                cuntNumber++;
            }else {
                cuntOther++;
            }

        }
        System.out.println("大写字母出现次数为：" + cuntUpper);
        System.out.println("小写字母出现次数为：" + cuntLower);
        System.out.println("数字出现次数为：" + cuntNumber);
        System.out.println("其他字符出现次数为：" + cuntOther);

    }

}
