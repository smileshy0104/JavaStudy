package MethodQuote;

//引用类的实例方法【应用】
interface MyString {
    String mySubString(String s, int x, int y);
}

public class QuoteDemo3 {
    public static void main(String[] args) {
        //Lambda简化写法
        useMyString((s, x, y) -> s.substring(x, y));

        //引用类的实例方法
        useMyString(String::substring);

    }

    private static void useMyString(MyString my) {
        //左闭右开
        String s = my.mySubString("HelloWorld", 2, 5);
        System.out.println(s);
    }
}