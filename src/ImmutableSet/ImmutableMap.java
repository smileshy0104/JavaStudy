package ImmutableSet;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//不可变的Map集合
public class ImmutableMap {
    public static void main(String[] args) {
       /*
        创建Map的不可变集合
            细节1：
                键是不能重复的
            细节2：
                Map里面的of方法，参数是有上限的，最多只能传递20个参数，10个键值对
            细节3：
                如果我们要传递多个键值对对象，数量大于10个，在Map接口中还有一个方法
        */

        // 1、键值对个数小于等于10（不可变 Map 中的键必须是唯一的。）
        System.out.println("------------1、键值对个数小于等于10--------------");
        //一旦创建完毕之后，是无法进行修改的，在下面的代码中，只能进行查询操作
        Map<String, String> map = Map.of("张三", "南京", "李四", "北京", "王五", "上海",
                "赵六", "广州", "孙七", "深圳", "周八", "杭州",
                "吴九", "宁波", "郑十", "苏州", "刘一", "无锡",
                "陈二", "嘉兴");
        System.out.println(map.size());
        // 获取map中所有key值
        Set<String> keys = map.keySet();
        // 遍历key集合
        for (String key : keys) {
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }

        System.out.println("--------------------------");

        //使用 map.entrySet() 方法获取 Map 中所有键值对 Entry 的 Set 集合,并将其赋值给 entries 变量。
        Set<Map.Entry<String, String>> entries = map.entrySet();
        //这是一个增强 for 循环,用于遍历 entries 集合中的每一个 Map.Entry<String, String> 对象。
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }
        System.out.println("--------------------------");

        System.out.println("------------2、键值对个数大于10--------------");

         /*
            创建Map的不可变集合,键值对的数量超过10个
        */

        //1.创建一个普通的Map集合
        HashMap<String, String> hm = new HashMap<>();
        hm.put("张三", "南京");
        hm.put("李四", "北京");
        hm.put("王五", "上海");
        hm.put("赵六", "北京");
        hm.put("孙七", "深圳");
        hm.put("周八", "杭州");
        hm.put("吴九", "宁波");
        hm.put("郑十", "苏州");
        hm.put("刘一", "无锡");
        hm.put("陈二", "嘉兴");
        hm.put("aaa", "111");

        //2.利用上面的数据来获取一个不可变的集合
/*
        //获取到所有的键值对对象（Entry对象）
        Set<Map.Entry<String, String>> entries = hm.entrySet();
        //把entries变成一个数组
        Map.Entry[] arr1 = new Map.Entry[0];
        //toArray方法在底层会比较集合的长度跟数组的长度两者的大小
        //如果集合的长度 > 数组的长度 ：数据在数组中放不下，此时会根据实际数据的个数，重新创建数组
        //如果集合的长度 <= 数组的长度：数据在数组中放的下，此时不会创建新的数组，而是直接用
        Map.Entry[] arr2 = entries.toArray(arr1);
        //不可变的map集合
        Map map = Map.ofEntries(arr2);
        map.put("bbb","222");*/

        // 如果需要创建超过10个键值对的不可变 Map,应该使用 Map.ofEntries() 方法。
        //Map<Object, Object> map = Map.ofEntries(hm.entrySet().toArray(new Map.Entry[0]));
        // 不可变集合
        Map<String, String> map1 = Map.copyOf(hm);
        // 不可变集合
//        map.put("bbb", "222");
    }
}
