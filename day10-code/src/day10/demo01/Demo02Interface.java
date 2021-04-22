package day10.demo01;

public class Demo02Interface {
    public static void main(String[] args) {
        //创建实现类对象
        MyInterfaceDefaultA a = new MyInterfaceDefaultA();
        a.methodAbs();//调用实现类里实现了的抽象方法
        a.methodDefault();//调用默认方法，如果实现类当中没有，会向上找接口


    }
}
