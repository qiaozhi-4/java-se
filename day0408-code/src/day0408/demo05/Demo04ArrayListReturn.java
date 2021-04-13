package day0408.demo05;
/*
题目:
用一个大集合存入20个随机数字，然后筛选其中的偶数元素，放到小集合当中。要求使用自定义的方法来实现筛选。
分析:
1．需要创建一个大集合,用来存储int数字:<Integer>
2．随机数字就用Random nextInt
3．循环20次,把随机数字放入大集合:for循环、add方法
4．定义一个方法,用来进行筛选。
筛选:根据大集合，筛选符合要求的元素，得到小集合。
三要素
返回值类型:ArrayList小集合（里面元素个数不确定)
方法名称: getSmaLlList
参数列表:ArrayList大集合（装着20个随机数字)
5．判断（if)是偶数:num % 2== 0
6.如果是偶数，就放到小集合当中，否则不放。
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Demo04ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> listA = new ArrayList<>();//创建大数组
        System.out.println(listA);

        Random r = new Random();

        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100) + 1;
            listA.add(num);
        }
        //System.out.println(list);
        ArrayList<Integer> listB = getSmaLlList(listA);
        System.out.println("偶数总共有" + listB.size() + "个。");
        for (int i = 0; i < listB.size(); i++) {
            System.out.println(listB.get(i));
        }

    }

    //这个方法，接收大集合参数，返回小集合结果
    public static ArrayList<Integer> getSmaLlList(ArrayList<Integer> listA){
        ArrayList<Integer> listB = new ArrayList<>();//创建小数组
        for (int i = 0; i < listA.size(); i++) {
            int num = listA.get(i);
            if (num % 2 == 0){//判断大集合里面的数是否被2整除
                listB.add(num);
            }
        }
        return listB;
    }
}
