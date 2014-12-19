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

        initStdDraw();
        
        ArrayList<Point> points = new ArrayList<>();

        for (int i=0; i<25;i++) {
            points.add(new RandomPoint());
        }
        
        
        //show points to stdoutput
        for (Point p:points) {
            //System.out.println(p);
            p.render();
        }
        
        
    }
    
    public static void initStdDraw() {
        StdDraw.setXscale(-100, +100);
        StdDraw.setYscale(-100, +100);
        StdDraw.setPenColor(Color.BLACK);
        StdDraw.setPenRadius(0.04);
    }
}    
