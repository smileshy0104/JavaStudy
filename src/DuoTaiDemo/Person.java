package DuoTaiDemo;

//父类：
public class Person {
    private String name;
    private int age;

    //    空参构造
    public Person() {

    }

    //    带全部参数的构造
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //    get和set方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show() {
        System.out.println(name + ", " + age);
    }
}
