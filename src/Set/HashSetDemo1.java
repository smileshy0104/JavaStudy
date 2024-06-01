package Set;

import java.util.HashSet;

public class HashSetDemo1 {
    public static void main(String[] args) {
        //创建HashSet集合对象
        HashSet<String> set = new HashSet<String>();

        //添加元素
        set.add("hello");
        set.add("world");
        set.add("java");
        //不包含重复元素的集合
        set.add("world");

        //遍历增强for循环
        for (String s : set) {
            System.out.println(s);
        }

        System.out.println("--------------------");
    }
}
