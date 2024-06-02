package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo1 {
    public static void main(String[] args) {
        // 创建一个名字列表
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // 使用 Stream 流进行过滤和转换
        // 过滤出长度大于 5 的名字，并转换为大写
        // 使用 Collectors.toList() 将流转换为列表
        List<String> uppercaseNames = names.stream()
                .filter(name -> name.length() > 5)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        // 输出结果
        // 使用 forEach 输出结果
        uppercaseNames.forEach(System.out::println);

    }
}
