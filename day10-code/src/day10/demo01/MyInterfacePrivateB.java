package day10.demo01;

public interface MyInterfacePrivateB {

    public static void methodStatic1(){
        System.out.println("静态方法1");
        methodStaticCommon();
    }

    public static void methodStatic2(){
        System.out.println("静态方法2");
        methodStaticCommon();
    }

    //静态私有方法，解决多个静态方法之闸重复代码问题,java9才能在接口定义private方法
//    private static void methodStaticCommon(){
//        System.out.println("AAA");
//        System.out.println("BBB");
//        System.out.println("CCC");
//    }
    public static void methodStaticCommon(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
}
