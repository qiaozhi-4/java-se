package day0402.demo03;
/*
问题描述:定义Person的年龄时，无法阻止不合理的数值被设置进来。
解决方案:用private关键字将需要保护的成员变量进行修饰。

一旦使用了private进行修饰，那么本类当中仍然可以随意访问。
但是!超出了本类范围之外就不能再直接访问了。

间接访问private成员变量，就是定义一对儿Getter/Setter方法

必须叫setXxx或者是getXxx命名规则。
对于Getter来说，不能有参数，返回值类型和成员变量对应;
对于setter来说，不能有返回值，参数类型和成员变量对应。


*/

public class Person {
    String name;
    private int age;

    //这个成员方法，专门私语获取age的数据
    public int getAge() {
        return age;
    }
    //这个成员方法，专门用于向age设置数据
    public void setAge(int age) {
        if (age < 100 && age > 0){//如果是合理情况
            this.age = age;
        }else {
            System.out.println("数据不合理！");
        }

    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void show(){
        System.out.println("我的名字是：" + name + "，年龄：" + age);
    }
}
