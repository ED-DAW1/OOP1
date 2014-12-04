
package daw.ed.oop1;

/**
 * Poinit class
 * @author carlos
 */
public class Point {
    //Member attributes
    private double x;
    private double y;    
    
    
    public Point() {
        x = 0;
        y = 0;
    }
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double getX() {
        return this.x;
    }
    
    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.x) ^ (Double.doubleToLongBits(this.x) >>> 32));
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.y) ^ (Double.doubleToLongBits(this.y) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Point other = (Point) obj;        
        return this.x == other.x && this.y == other.y;
    }

    @Override
    public String toString() {
        return "Point{" + "x:" + x + ", y:" + y + '}';
    }

    /**
     * Add point coordinates
     * @param p 
     */
    void add(Point p) {
        this.x += p.x;
        this.y += p.y;        
    }

    /**
     * Substract point coordinates
     * @param p 
     */
    void sub(Point p) {
        this.x -= p.x;
        this.y -= p.y;
    }
    
    /**
     * Scale point coordinates by factor
     * @param factor 
     */
    void scale(double factor) {
        this.x *= factor;
        this.y *= factor;
    }

    
    
    
    
    
    
    
    
    
   
    
}
