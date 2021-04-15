package day0413.demo04;
/*
题目:
计算在-10.8到5.9之间，绝对值大于6或者小于2.1的整数有多少个?
分析:
1．既然已经确定了范围，for循环
2．起点位置-10.8应该转换成为-10，两种办法:
    2.1可以使用Math.ceil方法,向上(向正方向）取整
    2.2强转成为int，自动舍弃所有小数位
3．每一个数字都是整数，所以步进表达式应该是num++，这样每次都是+1的。
4．如何拿到绝对值:Math.abs方法。
5.—旦发现了一个数字，需要让计数器++进行统计。

 */
public class Demo04MathPractise {
    public static void main(String[] args) {

        System.out.println("(使用Math.ceil方法,向上(向正方向）取整)符合要求总共有：" + ceil());

        double min = -10.8;
        double max = 5.9;

        int count = 0;//符合要求的数量

        //这样处理，变量i就是区间之类所以整数
        for (int i = (int) min; max > i; i++){
            int abs = Math.abs(i);//取绝对值
            if (abs > 6 || abs < 2.1){
                count++;
            }
        }
        System.out.println("(强转成为int，自动舍弃所有小数位)符合要求总共有：" + count);
    }

    public static int ceil(){
        double min = -10.8;
        double max = 5.9;

        int count = 0;

        Math.ceil(min);
        Math.ceil(max);

        for (double i =  min; i <= max; i++ ){
            double abs = Math.abs(i);
            if (abs > 6 || abs < 2.1){
                count++;
            }
        }
        return  count;
    }
}
