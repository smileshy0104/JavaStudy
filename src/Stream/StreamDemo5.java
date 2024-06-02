package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

// Stream流的收集操作【应用】（重点）
public class StreamDemo5 {
    public static void main(String[] args) {

        System.out.println("----------toList和toSet方法演示 -------------");
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list1.add(i);
        }

        list1.add(10);
        list1.add(10);
        list1.add(10);
        list1.add(10);
        list1.add(10);

        //filter负责过滤数据的.
        //collect----负责收集数据.（最好配合Collectors进行使用，会在底层自动创建一个List集合，并把所有的数据添加到List集合中.）
        //获取流中剩余的数据,但是他不负责创建容器,也不负责把数据添加到容器中.

        //Collectors.toList() : 在底层会创建一个List集合.并把所有的数据添加到List集合中.
        List<Integer> list = list1.stream().filter(number -> number % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(list);

        //  Collectors.toSet() : 在底层会创建一个Set集合.并把所有的数据添加到Set集合中.
        Set<Integer> set = list1.stream().filter(number -> number % 2 == 0)
                .collect(Collectors.toSet());

        System.out.println(set);

        /**
         Stream流的收集方法 toMap方法演示
         创建一个ArrayList集合，并添加以下字符串。字符串中前面是姓名，后面是年龄
         "zhangsan,23"
         "lisi,24"
         "wangwu,25"
         保留年龄大于等于24岁的人，并将结果收集到Map集合中，姓名为键，年龄为值
         */

        System.out.println("----------toMap方法演示 -------------");

        ArrayList<String> listNew = new ArrayList<>();
        listNew.add("zhangsan,23");
        listNew.add("lisi,24");
        listNew.add("wangwu,25");

        Map<String, Integer> map = listNew.stream().filter(
                s -> {
                    String[] split = s.split(",");
                    int age = Integer.parseInt(split[1]);
                    return age >= 24;
                }

                //   collect方法只能获取到流中剩余的每一个数据.
                //在底层不能创建容器,也不能把数据添加到容器当中

                //Collectors.toMap 创建一个map集合并将数据添加到集合当中

                // s 依次表示流中的每一个数据

                //第一个lambda表达式就是如何获取到Map中的键
                //第二个lambda表达式就是如何获取Map中的值
        ).collect(Collectors.toMap(
                s -> s.split(",")[0],
                s -> Integer.parseInt(s.split(",")[1])));

        System.out.println(map);
    }
}
