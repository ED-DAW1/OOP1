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
    }

    
    @Test
    public void addPoint() {
        p.add(new Point(4.0,10.0));        
        assertEquals(new Point(9.0,20.0),p);        
    }
    
    @Test
    public void subPoint() {
        p.sub(new Point(6.0,5.0));
        assertEquals(new Point(-1.0,5.0),p);        
        
    }
    
    @Test
    public void scalePoint() {
        p.scale(4.0);
        assertEquals(new Point(20.0,40.0),p);        
    }    
    
}
