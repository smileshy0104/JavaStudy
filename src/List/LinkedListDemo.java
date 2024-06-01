package List;

import java.util.LinkedList;

// 1.LinkedList（链表集合）
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
//        public void addFirst(E e)	在该列表开头插入指定的元素
        method1(list);

//        public void addLast(E e)	将指定的元素追加到此列表的末尾
        method2(list);

//        public E getFirst()		返回此列表中的第一个元素
//        public E getLast()		返回此列表中的最后一个元素
        method3(list);

//        public E removeFirst()		从此列表中删除并返回第一个元素
//        public E removeLast()		从此列表中删除并返回最后一个元素
        method4(list);

    }

    private static void method4(LinkedList<String> list) {
        // 从此列表中删除并返回第一个元素
        String first = list.removeFirst();
        System.out.println(first);
        // 从此列表中删除并返回最后一个元素
        String last = list.removeLast();
        System.out.println(last);

        System.out.println(list);
    }

    private static void method3(LinkedList<String> list) {
        // 返回此列表中的第一个元素
        String first = list.getFirst();
        // 返回此列表中的最后一个元素
        String last = list.getLast();
        System.out.println(first);
        System.out.println(last);
    }

    private static void method2(LinkedList<String> list) {
        // 在该列表末尾插入指定的元素
        list.addLast("www");
        System.out.println(list);
    }

    private static void method1(LinkedList<String> list) {
        // 在该列表开头插入指定的元素
        list.addFirst("qqq");
        System.out.println(list);
    }
}
