package pratice;
import java.io.*;

class Dog {
    String name;
    int Age;
    String designation;
    float salary;
    int type;

//    void Large(){
//
//    }
//
//    void Middle(){
//
//    }

//    /* 实例化对象 */
//    Object referenceVariable = new Constructor();
//    /* 访问类中的变量 */
//    referenceVariable.variableName;
//    /* 访问类中的方法 */
//    referenceVariable.methodName();

    public void setAge(int age){
        Age = age;
    }

    public int getAge(){
        System.out.println("小狗这么大"+Age);
        return Age;
    }

    public Dog(String name){
        System.out.println("小狗名字叫"+name);
        //this.name = name;
    }

//    public dogName(String name){
////        this.name = name;
////    }

    public void dogAge(int age){
        Age = age;
    }

    public void dogdesignation(String dogDesignation){
        designation = dogDesignation;
    }

    public void dogSalary(int dogSalary){
        salary = dogSalary;
    }

    public static void main(String[] args){
        Dog meDog = new Dog("double");
        meDog.setAge(2);    /* 通过方法来设定age */
        meDog.getAge();      /* 调用另一个方法获取age */
        System.out.println("变量值"+meDog.Age);
        meDog.dogAge(2);
        meDog.dogdesignation("jiangsu");
        meDog.dogSalary(234);
        System.out.println(meDog.salary);
        System.out.println(meDog.designation);
        System.out.println(meDog.Age);


    }


}
