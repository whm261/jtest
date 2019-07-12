package pratice;
//方法的重写规则
////        参数列表必须完全与被重写方法的相同；
////        返回类型与被重写方法的返回类型可以不相同，但是必须是父类返回值的派生类（java5 及更早版本返回类型要一样，java7 及更高版本可以不同）；
////        访问权限不能比父类中被重写的方法的访问权限更低。例如：如果父类的一个方法被声明为public，那么在子类中重写该方法就不能声明为protected。
////        父类的成员方法只能被它的子类重写。
////        声明为final的方法不能被重写。
////        声明为static的方法不能被重写，但是能够被再次声明。
////        子类和父类在同一个包中，那么子类可以重写父类所有方法，除了声明为private和final的方法。
////        子类和父类不在同一个包中，那么子类只能够重写父类的声明为public和protected的非final方法。
////        重写的方法能够抛出任何非强制异常，无论被重写的方法是否抛出异常。但是，重写的方法不能抛出新的强制性异常，或者比被重写方法声明的更广泛的强制性异常，反之则可以。
////        构造方法不能被重写。
////   !     如果不能继承一个方法，则不能重写这个方法。
class Animal1{
    public void move(){
        System.out.println("keyidong");
    }
}

class Doge extends Animal1{

    public void move(){
        super.move();
        System.out.println("goukeyipao");
    }
    public void bark(){
        System.out.println("goukeyijiao");
    }
}

//    多态存在的三个必要条件
//            继承
//    重写
//            父类引用指向子类对象

//多态的实现方式
//        方式一：重写：
//        这个内容已经在上一章节详细讲过，就不再阐述，详细可访问：Java 重写(Override)与重载(Overload)。
//        方式二：接口
//        1. 生活中的接口最具代表性的就是插座，例如一个三接头的插头都能接在三孔插座中，因为这个是每个国家都有各自规定的接口规则，有可能到国外就不行，那是因为国外自己定义的接口类型。
//
//        2. java中的接口类似于生活中的接口，就是一些方法特征的集合，但没有方法的实现。具体可以看 java接口 这一章节的内容。
//
//        方式三：抽象类和抽象方法
//        详情请看 Java抽象类 章节。
public class OverrideOverload {
    public static void main(String[] args) {
        Animal1 ai = new Animal1();
        Doge di = new Doge();
        ai.move();
        di.move();
        di.bark();
        Animal1 al = new Doge();//父类引用指向子类对象
        al.move();
        OverrideOverload oo = new OverrideOverload();
        System.out.println(oo.test());
        oo.test(1);
        System.out.println(oo.test(1,"test3"));
        System.out.println(oo.test("test3",1));
    }

//    重载(Overload)
//    重载(overloading) 是在一个类里面，方法名字相同，而参数不同。返回类型可以相同也可以不同。
//
//        每个重载的方法（或者构造函数）都必须有一个独一无二的参数类型列表。
//
//        最常用的地方就是构造器的重载。
//
//        重载规则:
//
//        被重载的方法必须改变参数列表(参数个数或类型不一样)；
//        被重载的方法可以改变返回类型；
//        被重载的方法可以改变访问修饰符；
//        被重载的方法可以声明新的或更广的检查异常；
//        方法能够在同一个类中或者在一个子类中被重载。
//        无法以返回值类型作为重载函数的区分标准。

    public int test() {
        System.out.println("test1");
        return 1;
    }


    public void test(int i){
        System.out.println("test2");
    }

    public String test(int i,String s){
        System.out.println("test3");
        return "retest3";
    }

    public String test(String s,int i){
        System.out.println("test4");
        return "retest4";
    }

}
//    方法的重写(Overriding)和重载(Overloading)是java多态性的不同表现，重写是父类与子类之间多态性的一种表现，重载可以理解成多态的具体表现形式。
//
//        (1)方法重载是一个类中定义了多个方法名相同,而他们的参数的数量不同或数量相同而类型和次序不同,则称为方法的重载(Overloading)。
//        (2)方法重写是在子类存在方法与父类的方法的名字相同,而且参数的个数与类型一样,返回值也一样的方法,就称为重写(Overriding)。
//        (3)方法重载是一个类的多态性表现,而方法重写是子类与父类的一种多态性表现。