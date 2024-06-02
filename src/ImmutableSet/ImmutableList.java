package ImmutableSet;

import java.util.Iterator;
import java.util.List;

//不可变的list集合

public class ImmutableList {
    public static void main(String[] args) {
        /*
            创建不可变的List集合
            "张三", "李四", "王五", "赵六"
        */

        //一旦创建完毕之后，是无法进行修改的，在下面的代码中，只能进行查询操作
        // 1. List.of()创建不可变集合
        List<String> list = List.of("张三", "李四", "王五", "赵六");

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));

        System.out.println("---------------------------");

        // 使用增强for遍历不可变集合
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("---------------------------");

        // 使用迭代器遍历不可变集合
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("---------------------------");

        // 使用普通for循环遍历不可变集合
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
        System.out.println("---------------------------");

        //list.remove("李四");
        //list.add("aaa");

        // 不可变集合不可修改
//        list.set(0, "aaa");
    }
}
