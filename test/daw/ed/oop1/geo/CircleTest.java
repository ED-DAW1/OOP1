package daw.ed.oop1.geo;

import java.awt.Color;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author carlos
 */
public class CircleTest {
    private Circle c;

    
    @Before
    public void setUp() {
        c = new Circle(new Point(0.0,0.0),2.6,Color.BLUE);
    }

    @Test
    public void testCircleConstructors() {
        assertTrue(new Circle() instanceof Circle);
        assertTrue(new Circle(new Point(0.0,0.0),2.6,Color.BLUE) instanceof Circle);
        assertTrue(new Circle(new Point(0.0,0.0),2.6) instanceof Circle);
        assertEquals(2.6,c.getRadius(),0.0001);
        assertEquals(Color.BLUE,c.getColor());
    }
    
    @Test
    public void testCircleSettersAndGetters() {
        c.setRadius(4.9);
        c.setColor(Color.GREEN);
        c.setCenter(new Point(5.0,6.0));
        assertTrue(c.getRadius() == 4.9);
        assertTrue(Color.GREEN.equals(c.getColor()));
        assertTrue(c.getCenter().getX() == 5.0 && c.getCenter().getX() == 6.0);
    }
    
    @Test
    public void testPerimeter() {
        assertEquals(16.328,c.getPerimeter(),0.01);
    } 
    
    @Test
    public void testArea() {
        assertEquals(21.237216,c.getArea(),0.01);
    }
    
    @Test
    public void testToString() {
        assertEquals("Círculo{radio:2,60,x:0,00,y:0,00}"
                ,c.toString());
        
    }
    
    @Test
    public void testDistance() {
        double dist = c.distance(new Circle(5,10,2));
        assertEquals(6.4031,dist,0.001);
    }
    
    
    
}
