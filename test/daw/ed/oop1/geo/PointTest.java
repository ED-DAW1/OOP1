package daw.ed.oop1.geo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author carlos
 */
public class PointTest {
    
    private Point p;
    
    @Before
    public void setUp() {
        p = new Point(5.0,10.0);        
    }

    @Test
    public void testConstructor() {
        assertTrue(p instanceof Point);        
    }

    
    @Test
    public void testSettersAndGetters() {
        p.setX(10.0);
        p.setY(20.0);
        assertTrue(p.getX() == 10.0 && p.getY() == 20.0);
        p.setXY(80.0,90.0);
        assertTrue(p.getX() == 80.0 && p.getY() == 90.0); 
    }
    
    @Test
    public void testDistance() {
        double d;
        d = p.distance(new Point(4.0,5.0));        
        assertEquals(5.09,d,0.01); 
        d = p.distance(4.0,5.0);
        assertEquals(5.09,d,0.01);
        d = p.distance(new Point(9.0,8.0));
        assertEquals(4.47,d,0.01);
        d = p.distance(9.0,8.0);
        assertEquals(4.47,d,0.01);
    }
    
    @Test
    public void testString() {
        assertEquals("Punto {x:-40.0, y:-20.0}",
                new Point(-40,-20).toString());
    }
}
