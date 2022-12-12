/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5rectangle;

/**
 *
 * @author Anwar
 */
public class Rectangle {
    float length ;
    float width;
    Rectangle(){
        System.out.println("no argument constructor");
    }
    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }
    public double Area(){   
        return length*width;//method to calculate area of the rectangle
    }
}
