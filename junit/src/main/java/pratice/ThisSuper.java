package pratice;


// this 指向对象本身的指针，形参与成员名字重名，用 this 来区分。
//         super 超（父）类对象的一个指针
class Person{
    public static void Prt(String s){
        System.out.println(s);
    }

    Person(){
        Prt("父类·无参数构造方法： "+"A Person.");
    }

    Person(String name){
        Prt("父类·含一个参数的构造方法： "+"A person's name is " + name);
    }
}


public class ThisSuper extends Person{
    ThisSuper(){
        super();
        Prt("子类调·无参数构造方法： "+"A Person.");
    }

    ThisSuper(String name){
        super(name);
        Prt("子类调父类·含一个参数的构造方法： "+"A person's name is " + name);
    }

    ThisSuper(String name,int age){
        super(name);
        Prt("子类调父类·含一个参数的构造方法： "+"A person's age is " + age);
    }

    public static void main(String[] args){
        ThisSuper thisSuper = new ThisSuper();
        thisSuper = new ThisSuper("JACK");
        thisSuper = new ThisSuper("name",25);
    }

}

