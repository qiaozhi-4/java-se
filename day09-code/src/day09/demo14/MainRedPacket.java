package day09.demo14;

import java.util.ArrayList;

public class MainRedPacket {
    public static void main(String[] args) {
        Manger manger = new Manger("杰瑞", 1000);

        Member member1 = new Member("乔治", 0);
        Member member2 = new Member("佩奇", 0);
        Member member3 = new Member("汤姆", 0);

        //输出发红包前的个人信息和余额信息
        manger.show();//姓名：杰瑞  余额：1000
        member1.show();//姓名：乔治  余额：0
        member2.show();//姓名：佩奇  余额：0
        member3.show();//姓名：汤姆  余额：0
        System.out.println("===========");

        //发红包
        ArrayList<Integer> redList = manger.send(200, 3);

        //抢红包
        member1.receive(redList);
        member2.receive(redList);
        member3.receive(redList);

        //输出发红包后的个人信息和余额信息
        manger.show();//
        member1.show();//
        member2.show();//
        member3.show();//

    }
}
