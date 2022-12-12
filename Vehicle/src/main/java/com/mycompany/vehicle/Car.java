/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehicle;

/**
 *
 * @author Anwar
 */
public class Car extends Vehicle {
   private String bodyStyle;
public Car(String make, String color, int year, String model,
String bodyStyle) {
 super(make, color, year, model);
 this.bodyStyle = bodyStyle;
 }
 public void carDetails() {
 printDetails();//invoking the super class method
 System.out.println("Body Style: " + bodyStyle);//adding the print sentence for subclass
 }

}
   

