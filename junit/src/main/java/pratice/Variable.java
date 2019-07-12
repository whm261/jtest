package pratice;

//首先要知道变量应该是赋值以后才能使用的，但是有些不必人为赋值就有默认初始值，但是有些要人为定义初始值
//所以有些直接使用的并不是没有赋值，而是系统自定义了初始值，所以不会报错



public class Variable {
    public String instance = "实例变量1";
    public static String varaiable = "静态变量1";
    public static String Const = "静态常量1";

    public static void main(String[] args){
        String local = "局部变量1";
        System.out.println(local);  //局部变量就是在方法或语句块中的变量
        System.out.println();
        System.out.println(Const);
        Global global = new Global();  //类似这个就是实例变量，也称全局变量
        System.out.println(global.instance);  //实例变量就必须先把类new一个出来才能使用,因为他是在类中,方法外的
        System.out.println(varaiable);  //静态变量，也叫类变量，静态变量的访问方式1(在自己类的时候)
        System.out.println(Global.varaiable);   //静态变量的访问方法2(不在自己类的时候)

    }
}

class Global{
    public String instance = "实例变量2";
    public static String varaiable = "静态变量2";
    Global(){   //在类的内部使用自己的实例变量：要么老老实实new一个出来,就像上面那个
        //第二种方法就是在函数里面使用实例变量，注意，如果方法是静态方法参照方法1
        System.out.println(varaiable);
        System.out.println(instance);
    }
    public void InStance(){
        System.out.println(instance);   //静态变量访问方法1(在自己类的时候),静态常量和静态变量访问相同
        System.out.println(Variable.Const);
    }

}