import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    public void rectangleTest() {
        Rectangle rectangle = new Rectangle(2, 3);
        assertEquals("The lengths are not equal", 2, rectangle.getLength(), 0);
        assertEquals("The width is not the same", 3, rectangle.getWidth(), 0);
    }

    @Test
    public void rectangleSetLengthTest() {
        Rectangle rectangle = new Rectangle(4, 5);
        rectangle.setLength(6);
        assertEquals("The lengths are not equal", 6, rectangle.getLength(), 0);
    }

    @Test
    public void rectangleSetWidthTest() {
        Rectangle rectangle = new Rectangle(7, 8);
        rectangle.setWidth(9);
        assertEquals("The width is not the same", 9, rectangle.getWidth(), 0);
    }

    @Test
    public void rectangleAreaTest() {
        Rectangle rectangle = new Rectangle(10, 11);
        assertEquals("The areas are not equal", 110, rectangle.getArea(), 0);
    }
}
