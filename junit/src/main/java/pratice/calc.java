package pratice;

public class calc {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        //前缀自增自减法(++a,--a): 先进行自增或者自减运算，再进行表达式运算。

        //后缀自增自减法(a++,a--): 先进行表达式运算，再进行自增或者自减运算
        System.out.println(b++);
        System.out.println(++b);

        int x = 2*++a;
        int y = 2*b++;
        System.out.println("自增运算符前缀运算后a="+a+",x="+x);
        System.out.println("自增运算符后缀运算后b="+b+",y="+y);

        b = (a == 1) ? 20 : 30;
        System.out.println( "Value of b is : " +  b );
        b = (a == 10) ? 20 :30;
        System.out.println(b);

        String name = "James";
        boolean result = name instanceof String; // name 是 String 类型，所以真( Object reference variable ) instanceof  (class/interface type)

//        C = A + B将把A + B得到的值赋给C
//        C + = A等价于C = C + A
//        C - = A等价于C = C - A
//        C * = A等价于C = C * A
//        C＆= 2等价于C = C＆2
//！！！！！优先级
//        后缀	() [] . (点操作符)	左到右
//        一元	+ + - ！〜	从右到左
//        乘性 	* /％	左到右
//        加性 	+ -	左到右
//        移位 	>> >>>  << 	左到右
//        关系 	>> = << = 	左到右
//        相等 	==  !=	左到右
//        按位与	＆	左到右
//        按位异或	^	左到右
//        按位或	|	左到右
//        逻辑与	&&	左到右
//        逻辑或	| |	左到右
//        条件	？：	从右到左
//                赋值	= + = - = * = / =％= >> = << =＆= ^ = | =	从右到左
//        逗号	，	左到右
    }
}
