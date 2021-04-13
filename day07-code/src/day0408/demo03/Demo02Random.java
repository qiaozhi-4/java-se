package day0408.demo03;

import java.util.Random;

public class Demo02Random {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 30; i++) {
            int num = r.nextInt(10);//实际范围是1~9
            System.out.print(num + " ");
        }
    }
}
