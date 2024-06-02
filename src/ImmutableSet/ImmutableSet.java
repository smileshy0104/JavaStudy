package ImmutableSet;

import java.util.Iterator;
import java.util.Set;

//不可变的Set集合
public class ImmutableSet {
    public static void main(String[] args) {
        /*
           创建不可变的Set集合
           "张三", "李四", "王五", "赵六"


           细节：
                当我们要获取一个不可变的Set集合时，里面的参数一定要保证唯一性
        */

        //一旦创建完毕之后，是无法进行修改的，在下面的代码中，只能进行查询操作
        Set<String> set = Set.of("张三", "张三", "李四", "王五", "赵六");

        // 1. 通过for-each进行遍历
        for (String s : set) {
            System.out.println(s);
        }

        System.out.println("-----------------------");
        // 2. 通过迭代器进行遍历
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }

        System.out.println("-----------------------");
        // set不可修改
        //set.remove("王五");
    }
}
