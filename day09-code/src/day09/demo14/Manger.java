package day09.demo14;

import java.util.ArrayList;

//群主的类
public class Manger extends User{

    public Manger() {
    }

    public Manger(String name, int money) {
        super(name, money);
    }

    //totalMoney:发出红包总金额；count:发出红包个数
    public ArrayList<Integer> send(int totalMoney, int count){
        //首先需要一个集合，用来存储若干个红包的金额
        ArrayList<Integer> redList = new ArrayList<>();

        //首先判断群主余额够不够
        int leftMoney = super.getMoney();//获取群主当前余额并赋值给leftMoney
        if (leftMoney < totalMoney){
            System.out.println("余额不足！");
            return redList;//返回空集合结束发红包
        }

        //扣钱，其实就是重新设置余额
        super.setMoney(leftMoney - totalMoney);

        //发红包需要平均拆分成为count份
        int avg = totalMoney / count;
        int mod = totalMoney % count;//余数，有时候不能整除

        //除不开的零头，包在最后一个红包当中
        //下面把红包一个一个放到集合当中,发count个就循环count - 1次，因为最后一次还要加上余数
        for (int i = 0; i < count - 1; i++) {
            redList.add(avg);//list.add方法，把数值存放到集合redList里面
        }

        //最后一个红包
        int last = avg + mod;
        redList.add(last);//加上余数

        return redList;

    }
}
