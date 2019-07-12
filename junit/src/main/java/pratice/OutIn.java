package pratice;

class Out {
    private int age = 25;

    class In{
        public void print(){
            System.out.println(age);
        }

    }
}

public class OutIn {
    public static void main(String[] args) {
        //Out.In in = new Out().new In();    //方法1可以用来生成内部类的对象，这种方法存在两个小知识点需要注意：
        //
        // 1.开头的 Out 是为了标明需要生成的内部类对象在哪个外部类当中。
        //2.必须先有外部类的对象才能生成内部类的对象，因为内部类的作用就是为了访问外部类中的成员变量。

        Out out = new Out();
        Out.In in = out.new In();
        in.print();
    }
}

