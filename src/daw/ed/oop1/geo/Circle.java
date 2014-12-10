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
    private Point p;

    /**
     * Default constructor
     */
    public Circle() {}
    
        
    public double getArea() {
    }

    
    public double getPerimeter() {
    }

    /**
     * render the circle
     */
    public void render() {
        Color tmp = StdDraw.getPenColor();
        StdDraw.setPenColor(this.color);
        StdDraw.filledCircle(this.p.getX(), this.p.getY(), this.radius);
        StdDraw.setPenColor(tmp);
    }
}
