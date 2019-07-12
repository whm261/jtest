package MimeTypeUtils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class RoadTest {

    @Parameterized.Parameters
    //方法一：两个参数办法
//    public static <collection> collection initData(){
//        Object [][] object = {{"road","shanghai"},{"road","china"}};
//        return (collection) Arrays.asList(object);
//    }

    //方法二：一个参数办法
    public static List<String[]> initData(){
        return Arrays.asList(new String[][]{{"mingzhuroad","shanghai"},{"changchengroad","china"}});
    }

    private String name;
    private String address;

    public RoadTest(String name,String address){
        this.name = name;
        this.address = address;
    }

    @Test
    public void test(){
        System.out.println("hello "+this.name+" address is "+this.address);
    }

}

