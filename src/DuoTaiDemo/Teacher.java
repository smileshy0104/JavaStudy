package DuoTaiDemo;

//子类3：
public class Teacher extends Person {
    // @Override重写注解
    @Override
    public void show() {
        System.out.println("老师的信息为：" + getName() + ", " + getAge());
    }
}
