package daw.ed.oop1.geo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author carlos
 */
public class RectangleTest {
    
    Rectangle r;
    
    @Before
    public void setUp() {
        r = new Rectangle(10,20);
    }

    @Test
    public void testConstructor() {
        assertTrue(r instanceof Rectangle);
    }
    
    @Test
    public void testSettersAndGetters() {
        r.setLength(10);
        r.setWidht(20);
        assertTrue(r.getLength() == 10 
                && r.getWidht() == 20);   
    }

    @Test
    public void testToString() {
        assertEquals("Rectángulo{ancho:10, alto:20}",r.toString());
    }


    @Test
    public void testEquals() {
        assertEquals(r,new Rectangle(10,20));
    }
    
    @Test
    public void testOverlaps() {
        fail("Not implemented");
    }
    
    @Test
    public void testInner() {
        fail("Not implemented");
    }
    
    
}
