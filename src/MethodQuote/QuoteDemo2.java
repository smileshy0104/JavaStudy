package MethodQuote;

// **引用对象的实例方法**，其实就**引用类中的成员方法**
class PrintString {
    //把字符串参数变成大写的数据，然后在控制台输出
    public void printUpper(String s) {
        String result = s.toUpperCase();
        System.out.println(result);
    }
}

interface Printer {
    void printUpperCase(String s);
}

public class QuoteDemo2 {
    public static void main(String[] args) {

        //Lambda简化写法
        usePrinter(s -> System.out.println(s.toUpperCase()));

        //引用对象的实例方法
        PrintString ps = new PrintString();
        usePrinter(ps::printUpper);

    }

    //使用Printer接口的实现类
    private static void usePrinter(Printer p) {
        p.printUpperCase("HelloWorld");
    }
}
