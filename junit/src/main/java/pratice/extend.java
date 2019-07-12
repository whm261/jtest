package pratice;


//继承就是子类继承父类的特征和行为，使得子类对象（实例）具有父类的实例域和方法，或子类从父类继承方法，使得子类具有父类相同的行为
//不支持多继承，但是支持多重继承、不同类继承同一类
//继承的特性:子类拥有父类非 private 的属性、方法。
//
//子类可以拥有自己的属性和方法，即子类可以对父类进行扩展。
//
//子类可以用自己的方式实现父类的方法。
//
//Java 的继承是单继承，但是可以多重继承，单继承就是一个子类只能继承一个父类，多重继承就是，例如 A 类继承 B 类，B 类继承 C 类，所以按照关系就是 C 类是 B 类的父类，B 类是 A 类的父类，这是 Java 继承区别于 C++ 继承的一个特性。
//
//提高了类之间的耦合性（继承的缺点，耦合度高就会造成代码之间的联系越紧密，代码独立性越差）。

//class Animal{
//    private String name;
//    private int num;
//    public Animal(){
//
//    }
//    public void eat(){
//        System.out.println(name+"吃");
//    }
//    public void sleep(){
//        System.out.println(name+"睡");
//    }
//    public void ins(){
//        System.out.println(name+num);
//    }
//
//}

//类的继承是单一继承，也就是说，一个子类只能拥有一个父类，所以 extends 只能继承一个类
class Penguin extends Animal{
    public Penguin() {
        super();
    }
    public void eat(){
        this.eat();// this 调用自己的方法
        super.eat();// super 调用父类方法
    }
}

class Mouse extends Animal{
    public Mouse(String myNmae,int myNum){
        super();
    }
}

//使用 implements 关键字可以变相的使java具有多继承的特性，使用范围为类继承接口的情况，可以同时继承多个接口（接口跟接口之间采用逗号分隔）。
interface A{
    public void eat();
    public void sleep();
}

interface B{
    public void ins();
}

class C implements A,B{

    public void eat() {

    }

    public void sleep() {

    }

    public void ins() {

    }
}

public class extend{
    public static void main(String[] args){
        Animal animal = new Animal();
        animal.eat();
        Penguin penguin = new Penguin();
        penguin.eat();

    }
}