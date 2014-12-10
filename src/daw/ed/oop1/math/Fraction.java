package daw.ed.oop1.math;

/**
 * Fraction class
 * @author carlos
 */
public class Fraction {

    // Declare the instance variables

    private int numerator;
    private int denominator;
    
    /**
     * Constructor method
     * @param numerator numerator
     * @param denominator denominator
     */
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) throw new IllegalArgumentException(
                "Denominator can not be zero");
        else {
            this.numerator = numerator;
            this.denominator = denominator;
        }
    }
}
