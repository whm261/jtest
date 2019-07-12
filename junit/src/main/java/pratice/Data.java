package pratice;

public class Data {
    static boolean bool;
    static int i;
    static byte by;
    static short sh;
    static float fl;
    static double dou;
    static long lo;
    static char ch;
    static String Str;

    public static void main(String[] args){
        //byte
        System.out.println("基本类型：byte 二进制位数：" + Byte.SIZE);
        System.out.println("基本类型：byte 二进制位数：" + Byte.MAX_VALUE);
        System.out.println("基本类型：byte 二进制位数：" + Byte.MIN_VALUE);
        System.out.println("包装类：java.lang.Byte");

        //short
        System.out.println("基本类型：short 二进制位数：" + Short.SIZE);
        System.out.println("基本类型：short 二进制位数：" + Short.MAX_VALUE);
        System.out.println("基本类型：short 二进制位数：" + Short.MIN_VALUE);
        System.out.println("包装类：java.lang.Short");

        //int
        System.out.println("基本类型：int 二进制位数：" + Integer.SIZE);
        System.out.println("基本类型：int 二进制位数：" + Integer.MAX_VALUE);
        System.out.println("基本类型：int 二进制位数：" + Integer.MIN_VALUE);
        System.out.println("包装类：java.lang.int");

        //float
        System.out.println("基本类型：float 二进制位数：" + Float.SIZE);
        System.out.println("基本类型：float 二进制位数：" + Float.MAX_VALUE);
        System.out.println("基本类型：float 二进制位数：" + Float.MIN_VALUE);
        System.out.println("包装类：java.lang.float");

        //double
        System.out.println("基本类型：double 二进制位数：" + Double.SIZE);
        System.out.println("基本类型：double 二进制位数：" + Double.MAX_VALUE);
        System.out.println("基本类型：double 二进制位数：" + Double.MIN_VALUE);
        System.out.println("包装类：java.lang.double");

        //long
        System.out.println("基本类型：long 二进制位数：" + Long.SIZE);
        System.out.println("包装类：java.lang.Long");
        System.out.println("最小值：Long.MIN_VALUE=" + Long.MIN_VALUE);
        System.out.println("最大值：Long.MAX_VALUE=" + Long.MAX_VALUE);

        //char
        System.out.println("基本类型：char 二进制位数：" + Character.SIZE);
        System.out.println("包装类：java.lang.Character");
        // 以数值形式而不是字符形式将Character.MIN_VALUE输出到控制台
        System.out.println("最小值：Character.MIN_VALUE="
                + (int) Character.MIN_VALUE);
        // 以数值形式而不是字符形式将Character.MAX_VALUE输出到控制台
        System.out.println("最大值：Character.MAX_VALUE="
                + (int) Character.MAX_VALUE);

        System.out.println("Bool :" + bool);
        System.out.println("Byte :" + by);
        System.out.println("Character:" + ch);
        System.out.println("Double :" + dou);
        System.out.println("Float :" + fl);
        System.out.println("Integer :" + i);
        System.out.println("Long :" + lo);
        System.out.println("Short :" + sh);
        System.out.println("String :" + Str);

        String s = "1";
        byte b = Byte.parseByte( s );
        System.out.println(b);
        String s1 = "32.1";
        double d1 = Double.valueOf(s1).doubleValue();
        System.out.println(d1);
        int i1 = (int) d1;
        System.out.println(i1);
    }
}
