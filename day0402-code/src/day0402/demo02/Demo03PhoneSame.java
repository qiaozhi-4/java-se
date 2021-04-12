package day0402.demo02;

public class Demo03PhoneSame {
    public static void main(String[] args) {

        Phone one = new Phone();
        System.out.println(one.brand); //null
        System.out.println(one.price); //0.0
        System.out.println(one.color); //null
        System.out.println("==========");

        one.brand = "苹果";
        one.price = 8888.0;
        one.color = "黑色";
        System.out.println(one.brand); //苹果
        System.out.println(one.price); //8888.0
        System.out.println(one.color); //黑色
        System.out.println("==========");

        one.call("佩奇"); //给佩奇打电话
        one.sendMessage(); //群发信息
        System.out.println("==========");

        Phone two = one;
        System.out.println(two.brand); //苹果
        System.out.println(two.price); //8888.0
        System.out.println(two.color); //黑色
        System.out.println("==========");

        two.brand = "三星";
        two.price = 5888.0;
        two.color = "蓝色";
        System.out.println(two.brand); //三星
        System.out.println(two.price); //5888.0
        System.out.println(two.color); //蓝色
        System.out.println("==========");

        two.call("肖恩"); //给肖恩打电话
        two.sendMessage(); //群发信息
    }
}
