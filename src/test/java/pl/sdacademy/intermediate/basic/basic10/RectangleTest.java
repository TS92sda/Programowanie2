package pl.sdacademy.intermediate.basic.basic10;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RectangleTest {

    Rectangle rectangle;

    @Before

    public void setRectangle(){
        Rectangle rectangle = new Rectangle(3,4);
    }

    @After

    public void newSetRectangle(){
        System.out.println("After single test case");
    }

    @Test
    public void testCalculateArea(){
        Assert.assertEquals(12,rectangle.calculateArea());
    }
    




}

