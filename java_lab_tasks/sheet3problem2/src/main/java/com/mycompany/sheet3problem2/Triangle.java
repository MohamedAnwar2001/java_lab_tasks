/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sheet3problem2;

/**
 *
 * @author Anwar
 */
public class Triangle {
    private float x;  // length of side 1          
    private float y;       // length of side 2        
    private float b; // length of the triangle base              
    private float h;      // length of the triangle height    

    public void setX(float x) {
        this.x = x;
    }
    public void setY(float y) {
        this.y = y;
    }
    public void setB(float base) {
        this.b = base;
    }
    public void setH(float height) {
        this.h = height;
    }
    public void triCircumference(float x,float y,float z){
        System.out.println("Circumference of Triangle = "+(x+y+z));
    }
    public void triArea(float b,float h){
        System.out.println(" Area of Triangle = "+((0.5*b*h)));
    }  
}
