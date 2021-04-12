package cn.itcast.day29.demo02;
/*
有参数:小括号当中有内容，当一个方法需要一些数据条件，才能完成任务的时候，就是有参数。
例如两个数字相加，必须知道两个数字是各自多少，才能相加。

无参数:小括号当中留空。一个方法不需要任何数据条件，自己就能独立完成任务，就是无参数。
例如定义一个方法，打印固定5次HelloWorLd。
*/

public class Demo03MethodParam {
    public static void main(String[] args) {
        sum(10,20);
        System.out.println("========");
        meth();
    }
    //两个数字相乘，做乘法，必须知道两个数字各自是多少，否则无法进行计算
    //有参数
    public static void sum(int a,int b){
        int q=a*b;
        System.out.println(q);
    }
    //打印输出固定5次文本字符串
    //无参数
    public static void meth(){
        for (int i = 1; i <=5 ; i++) {
            System.out.println("HelloWorLd"+i);
        }
    }


}
