package Set;

public class NewStudent {
    private String name;
    private int age;

    public NewStudent() {
    }

    public NewStudent(String name, int age) {
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

    // HashSet集合存储----自定义类型元素,要想实现元素的唯一,要求必须重写hashCode方法和equals方法
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NewStudent student = (NewStudent) o;

        if (age != student.age) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }

    //  hashCode()返回对象的哈希码值
    //  hashCode()方法的一般约定是：
    //  1. 当且仅当两个对象相等时，它们的哈希码相等。
    //  2. 当两个对象的哈希码相等时，它们不一定相等。
    //  3. 对于任意非null的引用值x，x.hashCode() == x.hashCode()
    //  4. 对于任意的引用值x，x.hashCode() == 0
    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}
