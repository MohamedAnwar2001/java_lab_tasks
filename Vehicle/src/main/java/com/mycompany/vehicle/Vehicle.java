/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.vehicle;

/**
 *
 * @author Anwar
 */
public class Vehicle {

 private String make;
 private String color;
 private int year;
 private String model;
 public Vehicle(String make, String color, int year, String model)
{
 this.make = make;
 this.color = color;
 this.year = year;
 this.model = model;
 }
 public void printDetails() {
 System.out.println(" Manufacturer: " + make);
 System.out.println(" Color: " + color);
 System.out.println(" Year: " + year);
 System.out.println(" Model: " + model);
 }
}

