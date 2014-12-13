/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.ed.oop1;
import daw.ed.oop1.geo.*;
import edu.princeton.cs.introcs.StdDraw;
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author carlos
 */
public class OOP1 {
    // test client
    public static void main(String[] args) {

<<<<<<< HEAD
        // create and initialize two circles
        Circle c1 = new Circle(50,0,10);
        Circle c2 = new Circle();
        c2.setRadius(50);
        c2.setColor(Color.yellow);
=======
        //initStdDraw();
        
        ArrayList<Point> points = new ArrayList<>();
>>>>>>> main shows points, added distanceTest to Point

        points.add(new Point());
        points.add(new Point(4,5));
        points.add(new Point(20,40));
        points.add(new Point(90,34));
        
        for (Point p:points) {
            System.out.println(p);
        }
        
    }
    
    public static void initStdDraw() {
        StdDraw.setXscale(-100, +100);
        StdDraw.setYscale(-100, +100);
    }
}    
