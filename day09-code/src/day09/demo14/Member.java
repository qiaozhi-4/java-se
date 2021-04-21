package day09.demo14;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User{

    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list){
        //从多个红包当中随便抽取一个，给我自己。
        //随机获取一个集合当中的索引编号
        //Random().nextInt(list.size())获取一个随机数，list.size()表示随机数范围
        //list.size()取得集合元素的个数
        int index = new Random().nextInt(list.size());

        //根据索引，从集合当中删除，并且得到被删除的红包，给我自己
        //list.remove()从当前集合中删除某个元素
        int delta = list.remove(index);

        //当前成员自己本来有多少钱:
        int money = super.getMoney();

        //把抢到的红包加到自己的余额
        super.setMoney(money + delta);
    }
}
