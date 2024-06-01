package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

//  ListDemo1.java（List集合）
public class ListDemo1 {
    public static void main(String[] args) {
        // List集合创建
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        method1(list);
        method2(list);
        method3(list);
        method4(list);

        System.out.println("---------List集合的遍历方式：-----------");
        //1.迭代器
        /*Iterator<String> it = list.iterator();
             while(it.hasNext()){
                String str = it.next();
                System.out.println(str);
        }*/


        //2.增强for
        //下面的变量s，其实就是一个第三方的变量而已。
        //在循环的过程中，依次表示集合中的每一个元素
        /* for (String s : list) {
               System.out.println(s);
           }*/

        //3.Lambda表达式
        //forEach方法的底层其实就是一个循环遍历，依次得到集合中的每一个元素
        //并把每一个元素传递给下面的accept方法
        //accept方法的形参s，依次表示集合中的每一个元素
        //list.forEach(s->System.out.println(s) );


        //4.普通for循环
        //size方法跟get方法还有循环结合的方式，利用索引获取到集合中的每一个元素
        /*for (int i = 0; i < list.size(); i++) {
                    //i:依次表示集合中的每一个索引
                    String s = list.get(i);
                    System.out.println(s);
                }*/

        // 5.列表迭代器
        //获取一个列表迭代器的对象，里面的指针默认也是指向0索引的

        //额外添加了一个方法：在遍历的过程中，可以添加元素
        ListIterator<String> it = list.listIterator();
        while (it.hasNext()) {
            String str = it.next();
            if ("bbb".equals(str)) {
                //qqq
                it.add("qqq");
            }
        }
        System.out.println(list);
    }

    private static void method4(List<String> list) {
        //        E get(int index)		返回指定索引处的元素
        String s = list.get(0);
        System.out.println(s);
    }

    private static void method3(List<String> list) {
        //        E set(int index,E element)	修改指定索引处的元素，返回被修改的元素
        //被替换的那个元素,在集合中就不存在了.
        String result = list.set(0, "qqq");
        System.out.println(result);
        System.out.println(list);
    }

    private static void method2(List<String> list) {
        //        E remove(int index)		删除指定索引处的元素，返回被删除的元素
        //在List集合中有两个删除的方法
        //第一个 删除指定的元素,返回值表示当前元素是否删除成功
        //第二个 删除指定索引的元素,返回值表示实际删除的元素
        String s = list.remove(0);
        System.out.println(s);
        System.out.println(list);
    }

    private static void method1(List<String> list) {
        //        void add(int index,E element)	在此集合中的指定位置插入指定的元素
        //原来位置上的元素往后挪一个索引.
        list.add(0, "qqq");
        System.out.println(list);
    }
}