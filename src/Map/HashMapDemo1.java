package Map;

import java.util.HashMap;
import java.util.Set;

//  HashMapDemo1.java
public class HashMapDemo1 {
    public static void main(String[] args) {
        //创建HashMap集合对象
        HashMap<Student, String> hm = new HashMap<Student, String>();

        //创建学生对象
        Student s1 = new Student("林青霞", 30);
        Student s2 = new Student("张曼玉", 35);
        Student s3 = new Student("王祖贤", 33);
        Student s4 = new Student("王祖贤", 33);

        //把学生添加到集合
        hm.put(s1, "西安");
        hm.put(s2, "武汉");
        hm.put(s3, "郑州");
        hm.put(s4, "北京");

        //遍历集合
        //获取所有键的集合。用keySet()方法实现(获取所有的key)
        Set<Student> keySet = hm.keySet();
        for (Student key : keySet) {
            // 通过key获取value
            String value = hm.get(key);
            System.out.println(key.getName() + "," + key.getAge() + "," + value);
        }
    }
}
