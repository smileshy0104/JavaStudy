package Set;

import java.util.Comparator;
import java.util.TreeSet;

// 1.TreeSet集合
// 比较器排序Comparator的使用
public class TreeSetDemo3 {
    public static void main(String[] args) {
        //创建集合对象
        TreeSet<Teacher> ts = new TreeSet<>(new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                //o1表示现在要存入的那个元素
                //o2表示已经存入到集合中的元素

                //主要条件
                int result = o1.getAge() - o2.getAge();
                //次要条件
                result = result == 0 ? o1.getName().compareTo(o2.getName()) : result;
                return result;
            }
        });
        //创建老师对象
        Teacher t1 = new Teacher("zhangsan", 23);
        Teacher t2 = new Teacher("lisi", 22);
        Teacher t3 = new Teacher("wangwu", 24);
        Teacher t4 = new Teacher("zhaoliu", 24);
        //把老师添加到集合
        ts.add(t1);
        ts.add(t2);
        ts.add(t3);
        ts.add(t4);
        //遍历集合
        for (Teacher teacher : ts) {
            System.out.println(teacher);
        }
    }
}
