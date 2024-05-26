import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }

        //2.创建对象，其实就是申明一下，我准备开始用Scanner这个类了。
        Scanner sc = new Scanner(System.in);
        //3.接收数据
        //当程序运行之后，我们在键盘输入的数据就会被变量i给接收了
        System.out.println("请在键盘输入一个数字：");
        // System.out.println("请输入一个数字");
        int i = sc.nextInt();
        System.out.println(i);
    }
}

