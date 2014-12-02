
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;


/**
 *
 * @author carlos
 */
public class FractionTest {

    @Before
    public void setUp() {
    }

    @Test(expected = ArithmeticException.class)
    public void constructorShouldThrowArithmeticException() {
        Fraction f = new Fraction(4,0);
    }

    @Test
    public void testValue() {
        Fraction n = new Fraction(4,3);
        assertEquals(1.33333,n.getValue(),0.01);
    }
    
    @Test
    public void testGetter() {
        
        Fraction f1 = new Fraction(2,8);
        Fraction f2 = new Fraction(0,9);
        Fraction f3 = new Fraction(4,5);
        
        int[] expectedValues = {2,0,4,8,9,5};
        int[] resultArray =  {
            f1.getNumerator(),f2.getNumerator(),f3.getNumerator(),
            f1.getDenominator(),f2.getDenominator(),f3.getDenominator()
        };

        assertArrayEquals(expectedValues, resultArray);
    }
    
    @Test
    public void testSetter() {
        Fraction f1 = new Fraction(1,3);
        f1.setDenominator(9);
        f1.setNumerator(9);
        
        assertEquals(new Fraction(9,9),f1);
    }
    
    @Test
    public void testReciprocal() {
        Fraction fr = new Fraction(3,4).reciprocal();
        Fraction f1 = new Fraction(4,3);
        
        assertTrue(fr.equals(f1));
    }
    
    
    @Test(expected = IllegalArgumentException.class)
    public void testAddArguments() {
        Fraction f1 = new Fraction(4,4);
        Fraction f2 = new Fraction(8,6);
        
        f1.add(f2);
    }
    
    @Test
    public void testAdd() {
        Fraction f1 = new Fraction(4,4);
        Fraction f2 = new Fraction(8,4);
        
        assertEquals(new Fraction(12,4),f1.add(f2));
    }
    
    @Test
    public void testAddFails() {
        Fraction f1 = new Fraction(4,4);
        Fraction f2 = new Fraction(8,4);
        
        assertFalse(new Fraction(12,9).equals(f1.add(f2)));
    }
}
