package ExtendDemo;

public class Human {
    // 合理隐藏
    private String name;
    private int age;

    // 合理暴露
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
}
