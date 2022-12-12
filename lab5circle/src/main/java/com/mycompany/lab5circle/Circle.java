package com.mycompany.lab5circle;

/**
 *
 * @author Anwar
 */
public class Circle {
    protected int radius;
    Circle(){
        System.out.println(" this is no argument constructor");
        
    }
    Circle(int radius){
        System.out.println("parametrized consturctor");
        this.radius=radius;
    }
    public double Area(){
        return Math.PI*radius*radius;
    }
}
 
