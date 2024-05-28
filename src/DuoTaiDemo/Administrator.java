package DuoTaiDemo;

//子类1：
public class Administrator extends Person {
    // @Override重写注解
    @Override
    public void show() {
        System.out.println("管理员的信息为：" + getName() + ", " + getAge());
    }
}
