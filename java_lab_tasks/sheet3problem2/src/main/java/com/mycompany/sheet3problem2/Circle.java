/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sheet3problem2;

/**
 *
 * @author Anwar
 */
public class Circle {
    private float reduis;
    public void setRadius(float reduis) {
        this.reduis = reduis;
    }
    public void circleArea(float reduis){
        System.out.println("Area of the circle = "+(Math.PI*reduis*reduis));
    
    }
    public void circleCircumference(float reduis){
        System.out.println("Curcumference of the circle = "+(Math.PI*2*reduis));
    }   
}
    
