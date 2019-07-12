package pratice;

import javax.xml.bind.TypeConstraintException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.RemoteException;

public class Exception {

    //所有的异常类是从 java.lang.Exception 类继承的子类。
    //
    //Exception 类是 Throwable 类的子类。除了Exception类外，Throwable还有一个子类Error 。
//    如果一个方法没有捕获到一个检查性异常，那么该方法必须使用 throws 关键字来声明。throws 关键字放在方法签名的尾部。
//
//    也可以使用 throw 关键字抛出一个异常，无论它是新实例化的还是刚捕获到的。
//    finally 关键字用来创建在 try 代码块后面执行的代码块。
//
//    无论是否发生异常，finally 代码块中的代码总会被执行。
//
//    在 finally 代码块中，可以运行清理类型等收尾善后性质的语句。
//
//            finally 代码块出现在 catch 代码块最后，语法如下：
    public static void main(String args[]) throws RemoteException {

//        TypeConstraintException f;
//        try{
//            file = new FileInputStream(fileName);
//            x = (char)file.read();
//        }catch (FileNotFoundException e){
//            f.printStackTrace();
//            return -1;
//        }catch (IOException e){
//            f.printStackTrace();
//            return -1;
//        }finally{
//        a[0] = 6;
//        System.out.println("First element value: " +a[0]);
//        System.out.println("The finally statement is executed");
   // }
        CheckingAccount c = new CheckingAccount(101);
        System.out.println("Depositing $500...");
        c.add(500);
//        try{
//            System.out.println("\nWithdrawing $100...");
//            c.dis(100);
//            System.out.println("\nWithdrawing $500...");
//            c.dis(500);
//        }catch (InsufficientFundsException e){
//            System.out.println("Sorry, but you are short $"
//                    + e.getAmount());
//            e.printStackTrace();
//        }

    }


    public static class  CheckingAccount{
        private double balance;
        private int number;
        public CheckingAccount(int number){
            this.number = number;
        }

        //存钱
        public void add(double amount){
            balance += amount;
        }
        //取钱
//        public void dis(double amount) throws InsufficientFundsException{
//            if(balance<=amount){
//                balance -= amount;
//            }
//            else{
//                double need = amount - balance;
//                throw new InsufficientFundsException(need);
//            }
//
//        }
        //返回差距
//        public double getNeed(){
//            return amount - balance;
//        }

        //返回余额
        public double getBalance(){
            return balance;
        }

        //返回卡号
        public int getNumber(){
            return number;
        }



//        private class InsufficientFundsException extends Throwable {
//            public InsufficientFundsException(double need) {
//                return amount - balance;
//            }
//        }
    }



}
