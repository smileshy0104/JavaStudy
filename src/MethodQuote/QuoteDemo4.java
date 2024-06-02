package MethodQuote;

//引用构造器【应用】
class Student {
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
}

interface StudentBuilder {
    Student build(String name, int age);
}

public class QuoteDemo4 {
    public static void main(String[] args) {

        //Lambda简化写法
        useStudentBuilder((name, age) -> new Student(name, age));

        //引用构造器
        useStudentBuilder(Student::new);

    }

    private static void useStudentBuilder(StudentBuilder sb) {
        //会调用对象中的构造方法
        Student s = sb.build("林青霞", 30);
        System.out.println(s.getName() + "," + s.getAge());
    }
}