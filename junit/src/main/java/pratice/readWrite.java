package pratice;

import java.io.*;

public class readWrite {
//    读取控制台输入
////    Java 的控制台输入由 System.in 完成。
////
////    为了获得一个绑定到控制台的字符流，你可以把 System.in 包装在一个 BufferedReader 对象中来创建一个字符流。

    BufferedReader Bfr = new BufferedReader(new InputStreamReader(System.in));
//    从控制台读取多字符输入
//    从 BufferedReader 对象读取一个字符要使用 read() 方法，它的语法如下：
    //标准输入读取一个字符串需要使用 BufferedReader 的 readLine() 方法。
    public static void main(String[] args) throws IOException{
        char c;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));   // 使用 System.in 创建 BufferedReader
        //字符
        System.out.println("输入字符, 按下 'q' 键退出。");
        do{
            c=(char)bf.read();
            System.out.println(c);
        }
        while(c!='q');
        //字符串
        String str;
        System.out.println("start with anything");
        System.out.println("end with 'end");
        do{
            str=bf.readLine();
            System.out.println(str);
        }
        while(!str.equals("end"));

        int b = 'A';
        System.out.write(b);

        //FileInputStream
        //方法一：
        //InputStream f = new FileInputStream("C:/java/hello");
        //方法2：
//        File f = new File("C:/java/hello");
//        InputStream out = new FileInputStream(f);
//        ByteArrayInputStream bArray = new ByteArrayInputStream(byte []a, int off, int len);
//        DataInputStream dis = new DataInputStream(InputStream in);

        try{
            byte bWrite[] = {11,20,30,112};
            OutputStream os = new FileOutputStream("test.txt");
            for(int i = 0;i < bWrite.length;i++){
                os.write(bWrite[i]);
            }
            os.close();
            //上面的程序首先创建文件test.txt，并把给定的数字以二进制形式写进该文件，同时输出到控制台上。


            InputStream is = new FileInputStream("test.txt");
            int size = is.available();

            for (int i = 0;i < size;i++){
                System.out.println((char)is.read());
            }
            is.close();
        }catch (IOException e){
            System.out.println("Exception");
        }


    }
//PrintStream 继承了 OutputStream类，并且实现了方法 write()。这样，write() 也可以用来往控制台写操作。void write(int byteval)
//读取目录
//一个目录其实就是一个 File 对象，它包含其他文件和文件夹。
//
//如果创建一个 File 对象并且它是一个目录，那么调用 isDirectory() 方法会返回 true。
//
//可以通过调用该对象上的 list() 方法，来提取它包含的文件和文件夹的列表。
//          String s[] = f1.list();
//            for (int i = 0; i < s.length; i++) {
//        File f = new File(dirname + "/" + s[i]);
//        if (f.isDirectory()) {
//            System.out.println(s[i] + " 是一个目录");
//        } else {
//            System.out.println(s[i] + " 是一个文件");
//        }
//    }
    //删除文件可以使用 java.io.File.delete() 方法。
}
