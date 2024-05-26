public class MethodTest {
    public static void main(String[] args) {
        //在main()方法中调用定义好的方法
        // 无参数方法的练习
        getMax();

        // 带参数方法的练习
        getMax2(10, 20);

        // 携带返回值
        int sum = getSum(10, 20, 30);
        System.out.println(sum);

        // 重载方法
        compare(10, 20);
        compare((byte) 10, (byte) 20);
        compare((short) 10, (short) 20);
        compare(10L, 20L);

        //设计一个方法用于数组遍历，要求遍历的结果是在一行上的。例如：[11, 22, 33, 44, 55]
        int[] arr = {1, 2, 3, 4, 5};
        printArr(arr);


        //调用获取最大值方法，用变量接收返回结果
        int number = getMax(arr);

        //把结果输出在控制台
        System.out.println("Max number:" + number);
    }

    //定义一个方法，用于打印两个数字中的较大数，例如getMax()
    // 无参数方法的练习
    public static void getMax() {
        //方法中定义两个变量，用于保存两个数字
        int a = 10;
        int b = 20;

        //使用分支语句分两种情况对两个数字的大小关系进行处理
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }

    //定义一个方法，用于打印两个数字中的较大数，例如getMax()
    //为方法定义两个参数，用于接收两个数字
    // 带参数方法的练习
    public static void getMax2(int a, int b) {
        //使用分支语句分两种情况对两个数字的大小关系进行处理
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }


    //如果需要使用，那么必须返回
    //如果不需要使用，可以返回也可以不返回
    // 携带返回值
    public static int getSum(int month1, int month2, int month3) {
        int sum = month1 + month2 + month3;
        //因为方法的调用处，需要继续使用这个结果
        //所以我们必须要把sum返回
        return sum;
    }


    // 以下是重载方法
    //int
    public static boolean compare(int a, int b) {
        System.out.println("int");
        return a == b;
    }

    //byte
    public static boolean compare(byte a, byte b) {
        System.out.println("byte");
        return a == b;
    }

    //short
    public static boolean compare(short a, short b) {
        System.out.println("short");
        return a == b;
    }

    //long
    public static boolean compare(long a, long b) {
        System.out.println("long");
        return a == b;
    }

    //1.我要遍历数组
    //2.需要什么？  数组
    //3.调用处是否需要使用方法的结果。
    public static void printArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
    }

    //定义一个方法，用来获取数组中的最大值
    /*
        两个明确：
            返回值类型：int
            参数：int[] arr
     */
    public static int getMax(int[] arr) {
        int max = arr[0];

        for (int x = 1; x < arr.length; x++) {
            if (arr[x] > max) {
                max = arr[x];
            }
        }
        return max;
    }
}