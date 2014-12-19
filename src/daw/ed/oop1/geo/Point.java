package daw.ed.oop1.geo;

import edu.princeton.cs.introcs.StdDraw;
import java.awt.Color;

/**
 * Point class
 * @author carlos
 */
public class Point {
    //Member attributes
    protected double  x;
    protected double  y;  
    protected Color   c;
    
    
    public Point() {
        this.x = 0;
        this.y = 0;
    }
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Point(double x, double y,Color c) {
        this.x = x;
        this.y = y;
        this.c = c;
    }
    
    
    
    public double getX() {
        return this.x;
    }
    
    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }
    
    public void setY(double y) {
        this.y = y;
    }
    
    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(double x, double y) {
        double xDiff = this.x - x;
        double yDiff = this.y - y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
        
    }
    
    public double distance(Point p) {
        double xDiff = this.x - p.getX();
        double yDiff = this.y - p.getY();
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);        
    }
    
    public void render() {
        Color tmp = StdDraw.getPenColor();
        StdDraw.setPenColor(this.c);
        StdDraw.point(this.x, this.y);
        StdDraw.setPenColor(tmp);
    }
    
    @Override
    public String toString(){        
       return "Punto {x:" + this.x + ", y:" + this.y +"}"; 
    }
    
}