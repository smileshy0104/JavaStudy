package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo2 {
    public static void main(String[] args) {

        System.out.println("----------未使用Stream示例代码----------");
        //集合的批量添加
        ArrayList<String> list1 = new ArrayList<>(List.of("张三丰", "张无忌", "张翠山", "王二麻子", "张良", "谢广坤"));
        //list.add()

        //遍历list1把以张开头的元素添加到list2中。
        ArrayList<String> list2 = new ArrayList<>();
        for (String s : list1) {
            if (s.startsWith("张")) {
                list2.add(s);
            }
        }
        //遍历list2集合，把其中长度为3的元素，再添加到list3中。
        ArrayList<String> list3 = new ArrayList<>();
        for (String s : list2) {
            if (s.length() == 3) {
                list3.add(s);
            }
        }
        //遍历list3集合
        for (String s : list3) {
            System.out.println(s);
        }


        System.out.println("----------使用Stream示例代码----------");


        //Stream流
        //使用Stream流，把list1中以张开头的元素，再把长度为3的元素，再添加到list3中。
        list1.stream().filter(s -> s.startsWith("张"))
                .filter(s -> s.length() == 3)
                .forEach(s -> System.out.println(s));


    }
}
