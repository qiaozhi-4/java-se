package day0402.demo02;

public class Demo05PhoneReturn {

    public static void main(String[] args) {
        Phone two = getPhone();
        System.out.println(two.brand);//苹果
        System.out.println(two.price);//8888.0
        System.out.println(two.color);//玫瑰金
    }

    //当使用一个对象类型作为方法的返回值时:返回值其实就是对象的地址值。
    public static Phone getPhone(){
        Phone one = new Phone();
        one.brand = "苹果";
        one.price = 8888.0;
        one.color = "玫瑰金";
        return one;
    }
}
