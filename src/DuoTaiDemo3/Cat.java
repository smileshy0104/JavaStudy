package DuoTaiDemo3;

//猫类（子类）
public class Cat extends Animal {
    // 无参构造
    public Cat() {
    }

    // 有参构造
    public Cat(int age, String color) {
        // 调用父类的构造方法
        super(age, color);
    }

    // 重写父类的eat()方法
    @Override
    public void eat(String something) {
        System.out.println(getAge() + "岁的" + getColor() + "颜色的猫眯着眼睛侧着头吃" + something);
    }

    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }

}
