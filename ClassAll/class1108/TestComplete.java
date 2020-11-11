package ClassAll.class1108;

import ClassAll.class1108.Compute;
import org.junit.Assert;
import org.junit.Test;

public class TestComplete {
    /*
        Junit
    */
    @Test
    public void testAdd(){
        Compute c =new Compute();
        int r=c.add(1,2);
        Assert.assertEquals(r,3);
        System.out.println("1111111");
    }
    /*@Test
    public void testMinus(){
        Assert.assertEquals(123,123);
    }*/
}
