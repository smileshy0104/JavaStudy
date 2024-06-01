package Set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

// Set列表集合(不可以存储重复元素\不能遍历)
public class SetDemo1 {
    public static void main(String[] args) {
        //创建Set集合对象
        Set<String> set = new TreeSet<>();
        //添加元素
        set.add("ccc");
        set.add("aaa");
        set.add("aaa");
        set.add("bbb");

        // Set集合是没有索引的，所以不能使用通过索引获取元素的方法
//        for (int i = 0; i < set.size(); i++) {
//            //Set集合是没有索引的，所以不能使用通过索引获取元素的方法
//        }

        //遍历集合
        // 1.使用Iterator
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("-----------------------------------");
        // 2.使用增强for
        for (String s : set) {
            System.out.println(s);
        }
    }
}
