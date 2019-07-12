package pratice;

//构造器
//子类是不继承父类的构造器（构造方法或者构造函数）的，它只是调用（隐式或显式）。如果父类的构造器带有参数，则必须在子类的构造器中显式地通过 super 关键字调用父类的构造器并配以适当的参数列表。
//如果父类构造器没有参数，则在子类的构造器中不需要使用 super 关键字调用父类构造器，系统会自动调用父类的无参构造器。

class Animal {
    void eat() {
        System.out.println("animal : eat");
    }
}

class Do1 extends Animal{
    void eat() {
        System.out.println("dog : eat");
    }
    void eatTest() {
        this.eat();   // this 调用自己的方法
        super.eat();  // super 调用父类方法
    }
}

//当子类出现与父类一样的函数时，这个被称为 重写 也叫 覆盖
//
//Object类是所有类的直接父类或间接父类，也就是说是所有类的根父类，这个可以运用于参数的传递
//子类不能直接继承父类中的 private 属性和方法。
//子类  需要通过关键字 super 进行声明
class SuperClass{
    private int n;
    SuperClass(){
        System.out.println("SuperClass()");
    }
    SuperClass(int n){
        System.out.println("SuperClass(int n)");
        this.n = n;
    }
}

class SubClass extends SuperClass{
    private int n;
    SubClass(){
        System.out.println("SubClass()");
    }
    SubClass(int n){
        super(300);
        System.out.println("SubClass(int n)");
        this.n = n;
    }
}
public class extends1 {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        Do1 d = new Do1();
        d.eatTest();
        System.out.println("------SubClass 类继承------");
        SubClass s = new SubClass();
        SubClass s1 = new SubClass(100);
    }
}