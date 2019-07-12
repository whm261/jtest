package pratice;

public class loop {
    public static void main(String[] args){
        //while循环
        int b = 0;
        while(b<5){
            b++;
            System.out.println(b);
        }
        //do-while循环
        int c = 0;
        do {
            c++;
            System.out.println(c);
        }while (c<5);
        //for循环
        for(int i = 0;i<20;i++){
            System.out.println(i);
        }
        //增强for循环
        int [] num = {20,30,40,50};
        for(int x:num){
            System.out.println(x);
            if(x==30){
                break;  // break 主要用在循环语句或者 switch 语句中，用来跳出整个语句块。break 跳出最里层的循环，并且继续执行该循环下面的语句。
            }

        }
        String [] name = {"name","age","salary"};
        for(String y:name){
            System.out.println(y);
            if(y == "age"){
                continue;   //continue 适用于任何循环控制结构中。作用是让程序立刻跳转到下一次循环的迭代。在 for 循环中，continue 语句使程序立即跳转到更新语句。在 while 或者 do…while 循环中，程序立即跳转到布尔表达式的判断语句。
            }
        }
//有以下程序，输出 0-99，两个数值间使用空格分隔，每 10 个数一行，每行用 ---- 分隔
        for(int i =0;i <= 9;i++){
            for(int j = 0;j <= 9;j++){
                while(i * 10 + j > 29){
                    break;
                }
                System.out.println("" + i + j +"  ");

            }
            System.out.println("\n -------------------------------------- \n");
        }
        System.out.println("输出完毕！");
    }

}
