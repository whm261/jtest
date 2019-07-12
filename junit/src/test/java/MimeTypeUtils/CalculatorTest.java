package MimeTypeUtils;

import junit.framework.TestCase;

import javax.swing.*;

public class CalculatorTest extends TestCase {
    Calculator calculator = new Calculator();

    public void testAdd() {
        if (calculator.add(8, 2) == 10) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed!");
        }
    }

    public void testSub() {
        if (calculator.sub( 8, 2) ==  6){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }


    public void testMul() {
        if (calculator.mul(8,2) == 16) {
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }

    public void testDiv() {
        if(calculator.div(8,2) == 4){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}