/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.ed.oop1;
import daw.ed.oop1.geo.*;
import edu.princeton.cs.introcs.StdDraw;
import java.awt.Color;

/**
 *
 * @author carlos
 */
public class OOP1 {
    // test client
    public static void main(String[] args) {

        // create and initialize two circles
        Circle c1 = new Circle(10.0,new Point(50,0));
        Circle c2 = new Circle();
        c2.setRadius(50);
        c2.setColor(Color.yellow);

        // animate them
        StdDraw.setXscale(-100, +100);
        StdDraw.setYscale(-100, +100);
        
        c2.render();
        c1.render();
        
    }
}    
