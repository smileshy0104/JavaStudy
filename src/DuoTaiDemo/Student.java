package DuoTaiDemo;

//子类2：
public class Student extends Person {
    // @Override重写注解
    @Override
    public void show() {
        System.out.println("学生的信息为：" + getName() + ", " + getAge());
    }
}
