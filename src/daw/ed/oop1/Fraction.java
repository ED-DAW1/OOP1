package daw.ed.oop1;

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

    /**
     * Returns numerator
     * @return numerator 
     */
    public int getNumerator() {
        return numerator;
    }

    /**
     * Set numerator
     * @param n numerator
     */
    public void setNumerator(int n) {
        numerator = n;
    }

    /**
     * Get denominator
     * @return denominator
     */
    public int getDenominator() {
        return this.denominator;
    }

    /**
     * set denominator
     * @param denominator denominator
     */
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
        
    /**
     * Fractions reciprocal
     * @return reciprocal fraction
     */
    public Fraction reciprocal() {
        
        return new Fraction(this.denominator,this.numerator);
    }
    
    /**
     * Fraction decimal value
     * @return fraction decimal value
     */
    public double getValue() {
        return this.numerator/(float)this.denominator;
    }
    
    /**
     * Adds a fraction
     * Trhows an IllegalArgumentException if denominators differs
     * @param f Fraction to add
     * @return Fraction
     */
    public Fraction add(Fraction f) {
        if (this.denominator != f.getDenominator())
            throw new IllegalArgumentException();
        else 
            return new Fraction(this.numerator + f.getNumerator(),
                    this.denominator);
    }
        
    /**
     * @param o Fraction object
     * @return fraction equality
     */
    @Override
    public boolean equals(Object o) {
        return (o instanceof Fraction) &&
                (this.numerator == ((Fraction) o).numerator) &&
                (this.denominator == ((Fraction) o).denominator);
    }

    /**
     * Autogenerate hash code
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.numerator;
        hash = 97 * hash + this.denominator;
        return hash;
    }

}
