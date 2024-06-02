package MethodQuote;

interface Printable {
    void printString(String s);
}

public class QuoteDemo {
    public static void main(String[] args) {
        //在主方法中调用usePrintable方法
//        usePrintable((String s) -> {
//            System.out.println(s);
//        });
        //Lambda简化写法
        usePrintable(s -> System.out.println(s));

        //方法引用（使用System.out::println替代System.out.println(s)）
        usePrintable(System.out::println);

    }

    //定义一个方法，接收一个Printable接口对象作为参数
    private static void usePrintable(Printable p) {
        //调用Printable接口的printString方法
        p.printString("爱生活爱Java");
    }
}

