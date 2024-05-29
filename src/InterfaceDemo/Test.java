package InterfaceDemo;

public class Test {
    public static void main(String[] args) {
        // 创建实现类对象。
        // 调用实现类对象的方法。
        PingPongMan zjk = new PingPongMan();
        zjk.run();
        zjk.law();
        System.out.println(zjk.compittion("全球乒乓球比赛"));

    }
}