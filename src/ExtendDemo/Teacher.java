package ExtendDemo;

public class Teacher extends Human {
    // 工资
    private double salary;

    // 特有方法
    public void teach() {
        System.out.println("老师在认真教技术！");
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
