package day0413.demo02;
/*
String当中与获取相关的常用方法有:
public int length():获取字符串当中含有的字符个数，章到字符串长度。
public String concat(String str):将当前字符串和参数字符串拼接成为返回值新的字符串。
public char charAt(int index):获取指定索引位置的单个字符。(索引从e开始。)
public int indexOf(String str):查找参数字符串在本字符串当中首次出现的索引位置，如果没有返回-1值。
 */

public class Demo02StringGet {
    public static void main(String[] args) {
        //获取字符串的长度
        int length = "asdfasdasdasd".length();
        System.out.println("字符串的长度是：" + length);
        System.out.println("=========");

        //拼接字符串
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println(str1);//Hello
        System.out.println(str2);//World
        System.out.println(str3);//HelloWorld
        System.out.println("=========");

        //获取指定索引位置的单个字符
        String str4 = "Hello";
        char c = str4.charAt(1);
        System.out.println("在第1号索引位置的字符是：" + c);
        System.out.println("=========");

        //查找参数字符串在本来字符串当中出现的第一次索引位置
        // 如果根本没有，返回-1值
        String str5 = "Hello";
        int el = str5.indexOf("el");
        System.out.println("第一次索引值是：" + el);//1

        System.out.println("Hello".indexOf("sd"));//-1

    }
}
