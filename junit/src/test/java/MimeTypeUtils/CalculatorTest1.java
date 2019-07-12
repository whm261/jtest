package MimeTypeUtils;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest1 {
    Calculator  calculator;

    @Before
    public void Before() throws java.lang.Exception{
        calculator = new Calculator();
    }

    @After
    public void After() throws java.lang.Exception{
    }

    /**
     *
     * Method: add(int x, int y)
     *
     */
    @Test
    public void TestAdd()  throws java.lang.Exception{
        Assert.assertEquals(calculator.add(8,2),10);
    }

    /**
     *
     * Method: sub(int x, int y)
     *
     */
    @Test
    public void TestSub()   throws java.lang.Exception{
        Assert.assertEquals(calculator.sub(8,2),6);
    }

    /**
     *
     * Method: mul(int x, int y)
     *
     */
    @Test
    public void TestMul()   throws java.lang.Exception{
        Assert.assertEquals(calculator.mul(8,2),16);
    }

    /**
     *
     * Method: div(int x, int y)
     *
     */
    @Test
    public void TestDiv()   throws java.lang.Exception{
        Assert.assertEquals(calculator.div(8,2),4);
    }

    /**
     *
     * Method: loop(int x, int y)
     *
     */
//    @Test
//    public void TestLoop()  throws java.lang.Exception{
//        Assert.assertEquals(calculator.loop(1,1),1);
//    }
}
