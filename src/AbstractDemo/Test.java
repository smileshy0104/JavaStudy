package AbstractDemo;


// 父类,抽象类
// 1.抽象类不能创建对象
// 2.抽象类不能定义成员变量
// 3.抽象类可以有构造方法
// 4.抽象类不能定义成员方法
// 5.抽象类不能定义静态方法
abstract class Employee {
    private String id;
    private String name;
    private double salary;

    // 构造方法
    public Employee() {
    }

    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // 抽象方法
    // 抽象方法必须要放在抽象类中
    // 抽象方法没有方法体,没有方法体的方法就是抽象方法
    abstract public void work();
}

// 定义一个子类继承抽象类
class Manager extends Employee {
    public Manager() {
    }

    public Manager(String id, String name, double salary) {
        // 调用父类的构造方法
        super(id, name, salary);
    }

    // 2.重写父类的抽象方法（必须重写父类所有的抽象方法）
    // 3.子类重写父类的抽象方法,必须要加上@Override注解
    @Override
    public void work() {
        System.out.println("管理其他人");
    }
}

// 定义一个子类继承抽象类
class Cook extends Employee {
    public Cook() {
    }

    public Cook(String id, String name, double salary) {
        super(id, name, salary);
    }

    // 2.重写父类的抽象方法（必须重写父类所有的抽象方法）
    // 3.子类重写父类的抽象方法,必须要加上@Override注解
    @Override
    public void work() {
        System.out.println("厨师炒菜多加点盐...");
    }
}

// 测试类
public class Test {
    public static void main(String[] args) {
        // 创建抽象类,抽象类不能创建对象（重点）
        // 假设抽象类让我们创建对象,里面的抽象方法没有方法体,无法执行.所以不让我们创建对象
//		Employee e = new Employee();
//		e.work();

        // 3.创建子类
        // 创建子类对象,调用子类的方法
        Manager m = new Manager();
        m.work();

        // 创建子类对象,调用子类的方法
        Cook c = new Cook("ap002", "库克", 1);
        c.work();
    }
}

