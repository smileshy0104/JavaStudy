package DuoTaiDemo2;

abstract class Animal {
    abstract void eat();
}

class Cat extends Animal {
    public void eat() {
        System.out.println("吃鱼");
    }

    public void catchMouse() {
        System.out.println("抓老鼠");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("吃骨头");
    }

    public void watchHouse() {
        System.out.println("看家");
    }
}

public class Test1 {
    public static void main(String[] args) {
        // 向上转型
        Animal a = new Cat();
        a.eat();                // 调用的是 Cat 的 eat

        // 向下转型
//        Cat c = (Cat) a;
//        c.catchMouse();        // 调用的是 Cat 的 catchMouse

//        // 向下转型
//        Dog d = (Dog) a;
//        // 这是因为，明明创建了Cat类型对象，运行时，当然不能转换成Dog对象的。
//        d.watchHouse();        // 调用的是 Dog 的 watchHouse 【运行报错】

        // 向下转型
        // 提供了 `instanceof` 关键字，给引用变量————做“类型的校验”

//        变量名 instanceof 数据类型
//        如果变量属于该数据类型或者其子类类型，返回true。
//        如果变量不属于该数据类型或者其子类类型，返回false。
        if (a instanceof Cat) {
            Cat c = (Cat) a;
            c.catchMouse();        // 调用的是 Cat 的 catchMouse
        } else if (a instanceof Dog) {
            Dog d = (Dog) a;
            d.watchHouse();       // 调用的是 Dog 的 watchHouse
        }
    }
}