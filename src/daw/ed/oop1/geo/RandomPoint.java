package daw.ed.oop1.geo;

import java.awt.Color;

/**
 *
 * @author carlos
 */
public class RandomPoint extends Point {

    public RandomPoint() {
        this.x = Math.random()*200-100;
        this.y = Math.random()*200-100;
        
        int r = (int) (Math.random()*255);
        int g = (int) (Math.random()*255);
        int b = (int) (Math.random()*255);
        int a = (int) (Math.random()*255);
        this.c = new Color(r,g,b,a);                        
    }    
}
