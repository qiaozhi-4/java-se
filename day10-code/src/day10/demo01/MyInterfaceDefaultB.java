package day10.demo01;

public class MyInterfaceDefaultB implements MyInterfaceDefault{
    @Override
    public void methodAbs() {

        System.out.println("实现的抽象方法BBB");
    }

    @Override
    public void methodDefault(){
        System.out.println("实现类B覆盖重写了接口的默认方法");
    }
}
