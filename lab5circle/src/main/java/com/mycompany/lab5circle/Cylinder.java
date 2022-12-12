
package com.mycompany.lab5circle;
/**
 *
 * @author Anwar
 */
public class Cylinder extends Circle {
    protected int height;
     Cylinder(){
        System.out.println("non parametrized constructor");
    }
     Cylinder(int radius,int height){
         super(radius);
         this.height=height;
     }
     public double volume(){
         return Math.PI*radius*radius*height;
     }
}


