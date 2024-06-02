package Stream;

import java.util.ArrayList;
import java.util.function.Consumer;

// Stream流终结操作方法【应用】（重点）
public class StreamDemo4 {
    public static void main(String[] args) {
        // 创建一个ArrayList集合
        ArrayList<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("张无忌");
        list.add("张翠山");
        list.add("王二麻子");
        list.add("张良");
        list.add("谢广坤");

        method1(list);

//        long count()：返回此stream流中的元素数
        long count = list.stream().count();
        System.out.println(count);
    }

    private static void method1(ArrayList<String> list) {
        //  void forEach(Consumer action)：对此流的————每个元素执行操作
        //  Consumer接口中的方法void accept(T t)：对给定的参数执行此操作
        //在forEach方法的底层,会循环获取到流中的每一个数据.
        //并循环调用accept方法,并把每一个数据传递给accept方法
        //s就依次表示了流中的每一个数据.
        //所以,我们只要在accept方法中,写上处理的业务逻辑就可以了.
        list.stream().forEach(
                // 这里的Consumer接口中的accept方法,
                new Consumer<String>() {
                    // 重写accept方法,并写上处理的业务逻辑
                    @Override
                    public void accept(String s) {
                        System.out.println(s);
                    }
                }
        );

        System.out.println("====================");
        //lambda表达式的简化格式（使用匿名函数）
        //是因为Consumer接口中,只有一个accept方法
        list.stream().forEach(
                (String s) -> {
                    System.out.println(s);
                }
        );
        System.out.println("====================");
        //lambda表达式还是可以进一步简化的.
        list.stream().forEach(s -> System.out.println(s));
    }
}
