package MimeTypeUtils;

public class Calculator {
    public int add(int x,int y){
        return x+y;
    }

    public int sub(int x,int y){
        return x-y;
    }

    public int mul(int x,int y){
        return x*y;
    }
    //异常判断除法
    public int div(int x,int y){
        try{
            int z =  x/y;
        } catch (Exception e){
            e.printStackTrace();
        }
        return x/y;
    }

    //死循环
    public void loop(int x,int y){
        for(;;){
            x = y;
        }
    }

    public static void main(String[] args){
        int a = 3;
        int b = 1;
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(a,b));
        System.out.println(calculator.div(a,b));
        System.out.println(calculator.sub(a,b));
        System.out.println(calculator.mul(a,b));

    }


}
