package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo2 {
    public static void main(String[] args) {
        // 创建ArrayList集合对象
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");

        //1,数据类型一定是“集合或者数组”中元素的类型
        //2,str仅仅是一个变量名而已,在循环的过程中,依次表示集合或者数组中的————每一个元素
        //3,list就是要遍历的集合或者数组
        //4,使用增强for循环进行遍历集合
        System.out.printf("使用增强for循环进行遍历集合:");
        System.out.println();
        for (String str : list) {
            System.out.println(str);
        }


        System.out.println("----------迭代器的细节注意----------");
        /*
        迭代器的细节注意点：
            1.报错NoSuchElementException
            2.迭代器遍历完毕，————指针不会复位（重点）
            3.循环中只能用一次next方法（重点）
            4.迭代器遍历时，不能用集合的方法进行增加或者删除
                暂时当做一个结论先行记忆，在今天我们会讲解源码详细的再来分析。
                如果我实在要删除：那么可以用迭代器提供的remove方法进行删除。
                如果我要添加，暂时没有办法。(只是暂时)
       */

        //1.创建集合并添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");

        //2.获取迭代器对象
        //迭代器就好比是一个箭头，默认指向集合的0索引处
        System.out.println("利用循环不断的去获取集合中的每一个元素:");
        Iterator<String> it = coll.iterator();
        //3.利用循环不断的去获取集合中的每一个元素
        while (it.hasNext()) {
            //4.next方法的两件事情：获取元素并移动指针
            String str = it.next();
            System.out.println(str);
        }

        //当上面循环结束之后，迭代器的指针————已经指向了最后没有元素的位置
        //System.out.println(it.next());//NoSuchElementException

        //迭代器遍历完毕，指针不会复位（对应的迭代器指针不会复位）
        System.out.printf("迭代器遍历完毕，指针不会复位:%s\n", it.hasNext());
        //如果我们要继续第二次遍历集合，只能再次获取一个新的迭代器对象
        Iterator<String> it2 = coll.iterator();
        while (it2.hasNext()) {
            String str = it2.next();
            System.out.println(str);
        }


        System.out.println("----------lambda表达式遍历----------");

         /*
        lambda表达式遍历：
                default void forEach(Consumer<? super T> action):
        */

        //1.创建集合并添加元素
        Collection<String> coll1 = new ArrayList<>();
        coll1.add("zhangsan");
        coll1.add("lisi");
        coll1.add("wangwu");
        //2.利用匿名内部类的形式
        //底层原理：
        //其实也会自己遍历集合，依次得到每一个元素
        //把得到的每一个元素，传递给下面的accept方法
        //s依次表示集合中的每一个数据
       /* coll.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/
        //lambda表达式
        coll1.forEach(s -> System.out.println(s));
    }
}