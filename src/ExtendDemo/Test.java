package ExtendDemo;

public class Test {
    public static void main(String[] args) {
        Teacher dlei = new Teacher();
        dlei.setName("播仔");
        dlei.setAge(31);
        dlei.setSalary(1000.99);
        System.out.println(dlei.getName());
        System.out.println(dlei.getAge());
        System.out.println(dlei.getSalary());
        dlei.teach();

        BenZhuRen linTao = new BenZhuRen();
        linTao.setName("灵涛");
        linTao.setAge(28);
        linTao.setSalary(1000.99);
        System.out.println(linTao.getName());
        System.out.println(linTao.getAge());
        System.out.println(linTao.getSalary());
        linTao.admin();

        Student xugan = new Student();
        xugan.setName("播仔");
        xugan.setAge(31);
        //xugan.setSalary(1000.99); // xugan没有薪水属性，报错！
        System.out.println(xugan.getName());
        System.out.println(xugan.getAge());


    }
}
