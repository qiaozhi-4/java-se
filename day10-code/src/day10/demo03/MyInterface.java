package day10.demo03;
/*
这个子接口当中有几个方法?答:4个。
methodA来源于接口A
methodB来源于接口B
methodCommon同时来源于接口A和B
method 来源于我自己
 */
public interface MyInterface extends MyInterfaceA,MyInterfaceB{

    public abstract void method();

    @Override
    public default void methodDefault() {
        System.out.println("覆盖重写接口A和接口B重名的默认方法");
    }
}
