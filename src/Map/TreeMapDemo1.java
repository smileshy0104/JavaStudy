package Map;

import java.util.TreeMap;

public class TreeMapDemo1 {
    public static void main(String[] args) {
        // 创建TreeMap集合对象
        TreeMap<NewStudent, String> tm = new TreeMap<>();

        // 创建学生对象
        NewStudent s1 = new NewStudent("xiaohei", 23);
        NewStudent s2 = new NewStudent("dapang", 22);
        NewStudent s3 = new NewStudent("xiaomei", 22);

        // 将学生对象添加到TreeMap集合中
        tm.put(s1, "江苏");
        tm.put(s2, "北京");
        tm.put(s3, "天津");

        // 遍历TreeMap集合,打印每个学生的信息
        tm.forEach(
                (NewStudent key, String value) -> {
                    System.out.println(key + "---" + value);
                }
        );
    }
}
