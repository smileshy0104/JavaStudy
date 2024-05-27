package ExtendDemo;

public class BenZhuRen extends Human {
    // 工资
    private double salary;

    // 特有方法
    public void admin() {
        System.out.println("班主任强调纪律问题！");
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
