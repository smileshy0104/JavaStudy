package MethodQuote;

// 	**引用类方法**，其实就是**引用类的静态方法**
interface Converter {
    // 定义了一个名为 Converter 的接口,它有一个名为 convert 的抽象方法,
    // 该方法接受一个 String 参数并返回一个 int 值
    int convert(String s);
}

public class QuoteDemo1 {
    public static void main(String[] args) {

        //Lambda写法
        // 实现了 Converter 接口的 convert 方法,将输入的 String 转换为 int 类型。
        useConverter(s -> Integer.parseInt(s));
        //引用类方法
        // 引用了 Integer 类的静态 parseInt 方法,该方法也可以完成将 String 转换为 int 的功能。
        useConverter(Integer::parseInt);

    }

    private static void useConverter(Converter c) {
        // 使用 Converter 接口的 convert 方法,将输入的 String 转换为 int 类型。
        int number = c.convert("666");
        System.out.println(number);
    }
}

