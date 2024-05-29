package DuoTaiDemo;

class Animal {
    public void eat() {
        System.out.println("动物吃东西！");

    }
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
}

/*
 调用成员变量时：编译看左边，运行看左边
 调用成员方法时：编译看左边，运行看右边（重点）
 */
public class Test1 {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        Animal a1 = new Dog();
        a1.eat();
        Animal a2 = new Cat();
        a2.eat();
//        a.catchMouse();//编译报错，编译看左边，Animal没有这个方法
    }
}