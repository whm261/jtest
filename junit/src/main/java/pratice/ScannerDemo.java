package pratice;

import java.util.Scanner;

public class ScannerDemo {
    //Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("next方式接收：");
        if(s.hasNext()){
            String s1 = s.next();
            System.out.println(s1);
        }
        s.close();
        //方法nextline()
//        if (scan.hasNextLine()) {
//            String str2 = scan.nextLine();
//            System.out.println("输入的数据为：" + str2);
//        }
//        scan.close();
    }

}
