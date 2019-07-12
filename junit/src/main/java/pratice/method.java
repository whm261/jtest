package pratice;

public class method {
//    Java方法是语句的集合，它们在一起执行一个功能。
//
//    方法是解决一类问题的步骤的有序组合
//            方法包含于类或对象中
//    方法在程序中被创建，在其他地方被引用
//            方法的优点
//              1. 使程序变得更简短而清晰。
//            2. 有利于程序维护。
//            3. 可以提高程序开发的效率。
//            4. 提高了代码的重用性。
//    方法的命名规则
//              1.方法的名字的第一个单词应以小写字母作为开头，后面的单词则用大写字母开头写，不使用连接符。例如：addPerson。
//            2.下划线可能出现在 JUnit 测试方法名称中用以分隔名称的逻辑组件。一个典型的模式是：test<MethodUnderTest>_<state>，例如 testPop_emptyStack。

    //方法定义：
//    方法包含一个方法头和一个方法体。
//    修饰符：修饰符，这是可选的，告诉编译器如何调用该方法。定义了该方法的访问类型。
//    返回值类型 ：方法可能会返回值。returnValueType 是方法返回值的数据类型。有些方法执行所需的操作，但没有返回值。在这种情况下，returnValueType 是关键字void。
//    方法名：是方法的实际名称。方法名和参数表共同构成方法签名。
//    参数类型：参数像是一个占位符。当方法被调用时，传递值给参数。这个值被称为实参或变量。参数列表是指方法的参数类型、顺序和参数的个数。参数是可选的，方法可以不包含任何参数。
//    方法体：方法体包含具体的语句，定义该方法的功能
    public static int max(int num1,int num2){
        int result;
        if (num1<num2){
            result = num2;
        }
        else
            result = num1;
        return result;
    }


    //方法的重载，就是说一个类的两个方法拥有相同的名字，但是有不同的参数列表。重载的方法必须拥有不同的参数列表。你不能仅仅依据修饰符或者返回类型的不同来重载方法。
    //传参发生变化
    public static double max(double d1,double d2){
        double result;
        if (d1<d2){
            result = d2;
        }
        else
            result = d1;
        return result;
    }

    //构造方法
//    一个对象被创建时候，构造方法用来初始化该对象。构造方法和它所在类的名字相同，但构造方法没有返回值。，默认构造方法的访问修改符和类的访问修改符相同
//    一旦你定义了自己的构造方法，默认构造方法就会失效。
    class myClass{
        int x;
        //构造函数
        myClass(){   //无参构造，参数构造
            x= 7;
        }
    }

    myClass c1 = new myClass();
    myClass c2 = new myClass();

    //Java 允许定义这样的方法，它在对象被垃圾收集器析构(回收)之前调用，这个方法叫做 finalize( )，它用来清除回收对象。
    //关键字 protected 是一个限定符，它确保 finalize() 方法不会被该类以外的代码调用。
    static  class cake extends Object{
        private int id ;
        private cake(int id){
            this.id = id;
            System.out.println(id);
        }


        protected void finalize() throws java.lang.Throwable{
            super.finalize();
            System.out.println(id+ "is disposed");
        }

    }

    //方法调用：
//    Java 支持两种调用方法的方式，根据方法是否返回值来选择。
//
//    当程序调用一个方法时，程序的控制权交给了被调用的方法。当被调用方法的返回语句执行或者到达方法体闭括号时候交还控制权给程序。
//
//    当方法返回一个值的时候，方法调用通常被当做一个值
    public static void main(String[] args){
        int i1 = 5;
        int i2 = 2;
        int k = max(i1,i2);
        System.out.println(k);
        cake c1 = new cake(1);
        cake c2 = new cake(2);
        cake c3 = new cake(3);

        c2 = c3 = null;
        System.gc();    //调用Java垃圾收集器

    }





}
