/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.ed.oop1;

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
