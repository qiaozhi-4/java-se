package cn.itcast.day05.demo03;

public class Demo06ArrayMin {
    public static void main(String[] args) {
        int[] array = { 5, 15, 30, 90, 45, 99999, -50 };
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            // 如果当前元素，比min更小，则换人
            if (array[i] < min){
                min = array[i];
            }
        }
        System.out.println("最小值为：" + min);
    }
}
