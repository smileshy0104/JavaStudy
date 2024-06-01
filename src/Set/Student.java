package Set;

//  Student.java(使用接口Comparable)
// 自然排序Comparable
public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    // 重写接口中toString()
    @Override
    public String toString() {
        System.out.println("我被自动执行了!");
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    // 重写接口中compareTo()
    @Override
    public int compareTo(Student o) {
        System.out.println("compareTo被自动执行了!");
        //按照对象的年龄进行排序
        //主要判断条件: 按照年龄从小到大排序
        int result = this.age - o.age;
        //次要判断条件: 年龄相同时，按照姓名的字母顺序排序
        result = result == 0 ? this.name.compareTo(o.getName()) : result;
        return result;
    }
}