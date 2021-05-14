package day10.demo07;

public class DemoGame {

    public static void main(String[] args) {

        //设置英雄名称
        Hero hero = new Hero();
        hero.setName("卡莎");

        //设置英雄技能,同时使用匿名内部类和匿名对象
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("biu~biu~biu~");
            }
        });


        hero.attack();

    }

}
