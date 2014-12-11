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
        double dist;
        dist = p.distance(new Point(9.0,8.0));
        assertEquals(0.000,dist,0.01);
        dist = p.distance(9.0,8.0);
        assertEquals(0.000,dist,0.01);
    }

    
       
    
}
