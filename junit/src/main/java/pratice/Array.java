package pratice;

import java.util.Arrays;

public class Array {
    double[] myList;    //必须声明数组变量，才能在程序中使用数组
    //创建数组
    //arrayRefVar = new dataType[arraySize];
    //一、使用 dataType[arraySize] 创建了一个数组。
    //二、把新创建的数组的引用赋值给变量 arrayRefVar。
    //声明：dataType[] arrayRefVar = new dataType[arraySize];
    //dataType[] arrayRefVar = {value0, value1, ..., valuek};

    //扩张数组：Array.copy(E[] e,newLength);a= Arrays.copyOf(a,a.length+1);
    public static void main(String[] args) {
        double[] list = new double[10];
        list[1] = 1;
        list[2] = 10;
        double total = 0;
        for (int i = 0; i < 10; i++) {
            total += list[i];
        }
        System.out.println(total);
//        java.util.Arrays类能方便地操作数组，它提供的所有方法都是静态的。具有以下功能：
//
//        给数组赋值：通过fill方法。
//        对数组排序：通过sort方法,按升序。
//        比较数组：通过equals方法比较数组中元素值是否相等。
//        查找数组元素：通过binarySearch方法能对排序好的数组进行二分查找法操作。
        int[] array =new int[5];
        Arrays.fill(array,5);
        System.out.println(array);
        Arrays.fill(array,2,4,8);
        System.out.println(array);
        Arrays.sort(array);
        System.out.println(array);
        int[] array1 = array.clone();
        System.out.println(Arrays.equals(array,array1));
        System.out.println(Arrays.binarySearch(array,2));

        String s[][] = new String[2][];//type[][] typeName = new type[typeLength1][typeLength2];
        s[0] = new String[2];       //为最高维分配引用空间，也就是为最高维限制其能保存数据的最长的长度，然后再为其每个数组元素单独分配空间 s0=new String("Good") 等操作。
        s[1] = new String[3];
        s[0][0] = new String("Good");
        s[0][1] = new String("Luck");
        s[1][0] = new String("to");
        s[1][1] = new String("you");
        s[1][2] = new String("!");
        System.out.println(s);

        //string转数组
        String str = "helloworld";
        char[] data =  str.toCharArray();
        for(int i = 0; i <data.length;i++){
            data[i] -= 32;
            System.out.println(data[i]);
        }
        System.out.println(new String(data));

    }



}

