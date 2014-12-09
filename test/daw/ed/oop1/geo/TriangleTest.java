package daw.ed.oop1.geo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author carlos
 */
public class TriangleTest {
    private Triangle t;
            
    @Before
    public void setUp() {
        t = new Triangle(10,20);
    }
    
    @Test
    public void testConstructor() {
        assertTrue(t instanceof Triangle);
    }
    
    @Test
    public void testSetterAndGetter() {
        t.setBase(50);
        t.setHeight(80);
        assertTrue(t.getBase() == 50 && t.getHeight() == 80);
    }

       
    @Test
    public void testEquals() {
        assertEquals(new Triangle(10,20),t);
    }

    @Test
    public void testToString() {
        assertEquals("Triángulo{base:10, altura:20}",t.toString());
    }
    
}
