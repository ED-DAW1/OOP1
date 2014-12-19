package daw.ed.oop1.geo;
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author carlos
 */
public class Polygon {
    protected ArrayList<Point> points;
    protected Color c;
    
    public Polygon() {
        this.points = new ArrayList<>();
    }
    
    public void addPoint(double x, double y) {
        this.points.add(new Point(x,y));
    }
    
    public void addPoint(Point p) {
        this.points.add(p);
    }
    
    protected double[] XCoords() {
        double [] x = new double[6];
        return x;
    }
    
    protected double[] YCoords() {
        double [] x = new double[6];
        return x;
    }
    
    
    
}
