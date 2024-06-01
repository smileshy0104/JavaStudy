package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// Map
/*
- Map集合的特点
  - **双列集合,一个键对应一个值**
  - **键不可以重复,值可以重复**
-
 */
public class MapDemo1 {
    public static void main(String[] args) {
        //创建集合对象(key\value)
        Map<String, String> map = new HashMap<String, String>();

        //V put(K key, V value) 将指定的值与该映射中的指定键相关联
        map.put("itheima001", "林青霞");
        map.put("itheima002", "张曼玉");
        map.put("itheima003", "王祖贤");
        // 不能是相同的key,可以是相同的value
        map.put("itheima003", "柳岩");

        //输出集合对象
        System.out.println(map);

        System.out.println("---------Map集合的基本功能-----------");

        //创建集合对象
        Map<String, String> map1 = new HashMap<String, String>();

        //V put(K key,V value)：添加元素
        map1.put("张无忌", "赵敏");
        map1.put("郭靖", "黄蓉");
        map1.put("杨过", "小龙女");

        //V remove(Object key)：根据键删除键值对元素
        System.out.println(map1.remove("郭靖"));
        System.out.println(map1.remove("郭襄"));

        //void clear()：移除所有的键值对元素
        map1.clear();

        //boolean containsKey(Object key)：判断集合是否包含指定的键
        System.out.println(map1.containsKey("郭靖"));
        System.out.println(map1.containsKey("郭襄"));

        //boolean isEmpty()：判断集合是否为空
        System.out.println(map1.isEmpty());

        //int size()：集合的长度，也就是集合中键值对的个数
        System.out.println(map1.size());

        //输出集合对象
        System.out.println(map1);

        System.out.println("---------Map集合的获取功能-----------");

        //创建集合对象
        Map<String, String> map2 = new HashMap<String, String>();

        //添加元素
        map2.put("张无忌", "赵敏");
        map2.put("郭靖", "黄蓉");
        map2.put("杨过", "小龙女");

        //V get(Object key):根据键获取值
        System.out.println(map2.get("张无忌"));
        System.out.println(map2.get("张三丰"));

        //Set<K> keySet():获取所有键的集合(key)
        Set<String> keySet = map2.keySet();
        for (String key : keySet) {
            System.out.println(key);
        }

        //Collection<V> values():获取所有值的集合(value)
        Collection<String> values = map2.values();
        for (String value : values) {
            System.out.println(value);
        }
    }
}