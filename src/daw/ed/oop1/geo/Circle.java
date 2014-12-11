package daw.ed.oop1.geo;

import java.awt.Color;
import edu.princeton.cs.introcs.StdDraw;

/**
 * Circle class definition
 *
 * @author carlos
 */
public class Circle {
    // Public constants

    /**
     * DEFAULT RADIUS
     */
    public static final double DEFAULT_RADIUS = 8.8;
    /**
     * DEFAULT COLOR
     */
    public static final Color DEFAULT_COLOR = Color.RED;

    // Private variables
    private double radius;
    private Color color;
    private Point center;

    /**
     * Default constructor
     */
    public Circle() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    public Circle(Point center, double r) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public Circle(double x, double y, double r) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public Circle(Point center, double r, Color BLUE) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public double getRadius() {
        throw new UnsupportedOperationException("Not supported yet."); 

    }

    public void setRadius(double radius) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public Color getColor() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void setColor(Color color) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public Point getCenter() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    public void setCenter(double x, double y) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void setCenter(Point center) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
            
    public double getArea() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    
    public double getPerimeter() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    public double distance(Circle that) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    /**
     * render the circle
     */
    public void render() {
        Color tmp = StdDraw.getPenColor();
        StdDraw.setPenColor(this.color);
        StdDraw.filledCircle(
                this.center.getX(),
                this.center.getY(), this.radius);
        StdDraw.setPenColor(tmp);
    }

    
}
