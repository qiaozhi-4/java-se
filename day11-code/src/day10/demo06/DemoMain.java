package day10.demo06;

public class DemoMain {

    public static void main(String[] args) {
        //创建英雄角色
        Hero hero = new Hero();
        //给英雄起名字
        hero.setName("卡莎");
        //设置年龄
        hero.setAge(18);

        //创建一个武器对象
        Weapon weapon = new Weapon("多兰剑");
        //为英雄配备一把武器
        hero.setWeapon(weapon);

        //年龄为18的卡莎使用多兰剑攻击敌方英雄。
        hero.attack();
    }

}
