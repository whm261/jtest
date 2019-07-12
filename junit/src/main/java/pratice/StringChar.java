package pratice;

import java.util.Arrays;

public class StringChar {
    public static void main(String[] args){
        char[] chArray = {'a', 'b','c'};
        char ch = new Character('c');
        System.out.println(Character.toUpperCase('c'));
        System.out.println(Character.toString('c'));
        System.out.println( Character.isUpperCase('c'));
        System.out.println(Character.isLetter('c'));



        String string1 = "字符串1：";
        String string2 = "字符串2：";
        System.out.println(string1.concat(string2));    //连接string
        System.out.println("1、" + string1 + "www.runoob.com");
        String fs;
//        fs = String.format("浮点型变量的值为 " +
//                "%f, 整型变量的值为 " +
//                " %d, 字符串变量的值为 " +
//                " %s",floatVar,intVar,stringVar);//格式化字符串

        char[] helloArray  = {'1','a','2','b'};
        String helloString = new String(helloArray);
        System.out.println(helloString);
        char it = helloString.charAt(2);    //查看位置
        System.out.println(it);
        System.out.println( helloString.toUpperCase() );

        StringBuffer Sbf = new StringBuffer("这是个字符春");
        Sbf.append(1);
        System.out.println(Sbf);
        Sbf.append("加1");
        System.out.println(Sbf);
        Sbf.reverse();  //反转
        System.out.println(Sbf);
        Sbf.delete(1,2);
        System.out.println(Sbf);
        Sbf.replace(0,2,"呆");
        System.out.println(Sbf);
        int[] arr = { 'a', 25, 45, 78, 'z' };
        System.out.println(Arrays.toString(arr));


    }
}
