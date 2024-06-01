package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

// 使用迭代器完成遍历（对Collections集合）
public class IteratorDemo1 {
    public static void main(String[] args) {
        //创建集合Collection对象
        Collection<String> c = new ArrayList<>();

        //添加元素
        c.add("hello");
        c.add("world");
        c.add("java");
        c.add("javaee");

        //Iterator<E> iterator()：返回此集合中元素的——迭代器，通过——集合的iterator()方法得到
        Iterator<String> it = c.iterator();

        //用while循环改进元素的判断和获取
        // 1.hasNext()：判断是否还有下一个元素
        while (it.hasNext()) {
            // 2.next()：返回下一个元素
            String s = it.next();
            if ("java".equals(s)) {
                // 3.remove()：删除当前元素
                it.remove();
            }
            System.out.println(s);
        }
        System.out.println(c);


        // 3.remove()：删除当前元素
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("d");

        Iterator<String> it1 = list.iterator();
        while (it1.hasNext()) {
            String s = it1.next();
            if ("b".equals(s)) {
                //指向谁,那么此时就删除谁.
                it1.remove();
            }
        }
        System.out.println(list);
    }
}