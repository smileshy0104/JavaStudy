package Set;

import java.util.TreeSet;

// 1.TreeSet集合
public class TreeSetDemo1 {
    public static void main(String[] args) {
        //创建TreeSet集合对象
        TreeSet<Integer> ts = new TreeSet<Integer>();

        //添加元素
        ts.add(10);
        ts.add(40);
        ts.add(30);
        ts.add(50);
        ts.add(20);
        // 不能添加相同的元素
        ts.add(30);

        //遍历集合(使用增强for循环遍历,并按自然排序输出)
        // 默认使用自然排序
        for (Integer i : ts) {
            System.out.println(i);
        }
    }
}
