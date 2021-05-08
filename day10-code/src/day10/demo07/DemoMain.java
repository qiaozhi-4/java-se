package day10.demo07;

public class DemoMain {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOn();

        //创建一个鼠标
        USB usbMouse = new Mouse();//多态写法
        //参数是usB类型，我正好传递进去的就是USB鼠标
        computer.useDevice(usbMouse);

        //创建一个键盘
        Keyboard keyboard = new Keyboard();//没有使用多态
        //方法参数是usB类型，传递进去的是实现类对象
        computer.useDevice(keyboard);

        computer.powerOff();
        System.out.println("==========");

        method(10.0);//正确写法，double-->double
        method(10);//正确写法，int-->double
    }

    public static void method(double num){

        System.out.println(num);
    }

}
