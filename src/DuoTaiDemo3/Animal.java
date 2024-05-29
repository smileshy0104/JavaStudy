package DuoTaiDemo3;

//动物类（父类）
public class Animal {
    private int age;
    private String color;

    // 无参构造方法
    public Animal() {
    }

    // 有参构造方法
    public Animal(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // 吃东西的方法（重写）
    public void eat(String something) {
        System.out.println("动物在吃" + something);
    }
}
