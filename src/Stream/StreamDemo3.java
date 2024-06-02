package Stream;

import java.util.*;
import java.util.stream.Stream;

public class StreamDemo3 {
    public static void main(String[] args) {
        //1、Collection体系的集合可以使用默认方法stream()生成流
        List<String> list = new ArrayList<String>();
        Stream<String> listStream = list.stream();

        Set<String> set = new HashSet<String>();
        Stream<String> setStream = set.stream();

        //2、Map体系的集合间接的生成流————（把**Map转成Set**集合，**间接的生成流**）
        Map<String, Integer> map = new HashMap<String, Integer>();
        Stream<String> keyStream = map.keySet().stream();
        Stream<Integer> valueStream = map.values().stream();
        Stream<Map.Entry<String, Integer>> entryStream = map.entrySet().stream();

        //3、数组可以通过Arrays中的静态方法stream生成流
        String[] strArray = {"hello", "world", "java"};
        Stream<String> strArrayStream = Arrays.stream(strArray);

        //4、同种数据类型的多个数据可以通过Stream接口的静态方法of(T... values)生成流
        Stream<String> strArrayStream2 = Stream.of("hello", "world", "java");
        Stream<Integer> intStream = Stream.of(10, 20, 30);
    }
}
