package pratice;


import java.text.Format;

//format 变量为私有变量，所以其他类不能直接得到和设置该变量的值。为了使其他类能够操作该变量，
// 定义了两个 public 方法：getFormat() （返回 format的值）和 setFormat(String)（设置 format 的值）
public class XiuShiFu {
    // 下面是声明常量的实例
    final int i =10;
    public static final int BOXWIDTH =6;
    static final String title = "this";
    private String format;
    public String getFormat(){
        return this.format;

    }
    public void setFormat(String format){
        this.format = format;
    }

}

class Father {    //final 类不能被继承，没有类能够继承 final 类的任何特性。

    protected void useful(Format fr) {
        //实现
    }

    public final void changeName() {

    }
}

class Son extends Father{
    protected void useful(Format fr){
        //子类重写了父类的 useful() 方法。
    }
    //final 方法可以被子类继承，但是不能被子类修改。

}


abstract class Super{
    abstract void m();  //任何继承抽象类的子类必须实现父类的所有抽象方法，除非该子类也是抽象类。

}
class big extends Super{
    void m(){}      //实现抽象方法
}
