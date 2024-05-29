package InterfaceDemo;

/**
 * 接口：接口体现的是规范。
 */
// 接口的定义：public interface SportMan { }
public interface SportMan {
    void run(); // 抽象方法，跑步。

    void law(); // 抽象方法，遵守法律。

    String compittion(String project);  // 抽象方法，比赛。
}
