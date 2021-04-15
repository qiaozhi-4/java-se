package day0413.demo04;

import java.util.Arrays;

/*
java.util.Arrays是一个与数组相关的工具类，里面提供了大量静态方法，用来实现数组常见的操作。
public static String toString(数组):将参数数组变成字符串（按照默认格式:[元素1，元素2,元素3...])
public static void sort(数组):按照默认升序（从小到大）对数组的元素进行排序。

备注:
1、如果是数值,sort默认按照升序从小到大2管如果是字符串,sort默认按照字母升序
3．如果是自定义的类型，那么这个自定义的类需要有Comparable或者Comparator接口的支持。(今后学习)

 */
public class Demo01Arrays {
    public static void main(String[] args) {
        int[] intArray1 = {1, 2, 3};
        //将int[数组按照默认格式变成字符串
        String s = Arrays.toString(intArray1);
        System.out.println(s);//[1, 2, 3]

        int[] intArray2 = {5, 2, 6, 9, 1, 8, 10};
        Arrays.sort(intArray2);
        System.out.println(Arrays.toString(intArray2));//[1, 2, 5, 6, 8, 9, 10]

        String[] str = {"bbb", "ccc", "aaa"};
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));//[aaa, bbb, ccc]

    }
}
