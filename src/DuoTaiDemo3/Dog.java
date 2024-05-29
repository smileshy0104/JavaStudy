package DuoTaiDemo3;

//狗类（子类）
public class Dog extends Animal {
    // 构造方法
    public Dog() {
    }

    // 构造方法
    public Dog(int age, String color) {
        // 调用父类的构造方法
        super(age, color);
    }

    //行为
    //eat(String something)(something表示吃的东西)
    //看家lookHome方法(无参数)
    // 重写父类的eat(String something)方法
    @Override
    public void eat(String something) {
        System.out.println(getAge() + "岁的" + getColor() + "颜色的狗两只前腿死死的抱住" + something + "猛吃");
    }
    
    public void lookHome() {
        System.out.println("狗在看家");
    }
}
