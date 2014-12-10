package daw.ed.oop1.geo;

import java.awt.Color;
import edu.princeton.cs.introcs.StdDraw;

/**
 * Circle class definition
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
    public static final Color DEFAULT_COLOR  = Color.RED;
   
   // Private variables
   private double radius;
   private Color color;
   private Point p;
   
   /**
    * Default constructor
    */
   public Circle() {                   
      radius = DEFAULT_RADIUS;
      color  = DEFAULT_COLOR;
      p = new Point();
      p.setX(0);
      p.setY(0);
   }
   
   /**
    * Constructor
    * @param radius 
    * @param xy center of circle
    */
   public Circle(double radius,Point xy) {  
      this();
      this.radius = radius;
      color = DEFAULT_COLOR;
   }
   
   /**
    * Constructor
    * @param radius
    * @param xy center of circle
    * @param color 
    */
   public Circle(double radius, Point xy,Color color) {
      this(radius,xy);
      this.color = color;
   }
   
   /**
    * Get circle radius
    * @return radius
    */
   public double getRadius() {
      return radius;
   }
   
   /**
    * Set circle radius
    * @param radius 
    */
   public void setRadius(double radius) {
      this.radius = radius;
   }
   
   /**
    * 
    * @return 
    */
   public Color getColor() {
      return color;
   }
   
   /**
    * 
    * @param color 
    */
   public void setColor(Color color) {
      this.color = color;
   }
 
   /**
    * 
    * @return 
    */
   @Override
   public String toString() {
      return String.format("Círculo{radio:%.2f,x:%.2f,y:%.2f}"
              ,radius,p.getX(),p.getY());
   }
 
   /**
    * 
    * @return 
    */
   public double getArea() {
      return radius*radius*Math.PI;
   }
   
   /**
    * 
    * @return 
    */
   public double getPerimeter() {
       return 2*radius*Math.PI;
   }
   
    /**
     * render the circle
     */
    public void render() {
       Color tmp = StdDraw.getPenColor();
       StdDraw.setPenColor(this.color);
       StdDraw.filledCircle(this.p.getX(),this.p.getY(),this.radius);
       StdDraw.setPenColor(tmp);
   }
}
