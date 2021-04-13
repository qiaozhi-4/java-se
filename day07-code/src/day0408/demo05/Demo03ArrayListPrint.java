package day0408.demo05;
/*
题目:
定义以指定格式打印集合的方法(ArrayList类型作为参数)，使用{}扩起集合，使用@分隔每个元素。
格式参照{元素@元素@元素}。

System.out.println(list);           [10，20，30]
printArrayList(list);               {10@20@30}
 */

import java.util.ArrayList;

public class Demo03ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("乔治");
        list.add("佩奇");
        list.add("汤姆");
        list.add("杰瑞");
        System.out.println(list);//[乔治, 佩奇, 汤姆, 杰瑞]
        printArrayList(list);

    }
     /*
     定义万法的三要素
     返回值类型:只是进行打印而已，没有运算，没有结果;所以用void
     方法名称: printArrayList
     参数列表:ArrayList
     */
    public static void printArrayList(ArrayList<String> list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if (i ==list.size()-1){
                System.out.println(name + "}");
            }else {
                System.out.print(name + "@");
            }

        }

    }

}
