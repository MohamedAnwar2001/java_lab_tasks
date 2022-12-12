/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehicle;

/**
 *
 * @author Anwar
 */
public class Main {
    public static void main(String[] args) {
        Car coupe = new Car("BMW", "black", 2020, "Series Gran Coupé",
"coupe");
 coupe.carDetails();
        System.out.println("*****************");
//Add a class called Bus that extend Vehicle and build it in the same style as Car. The create an
//object from it in Main class and call the method busDetails().  
    Bus b= new Bus ( "magic","red",2019,"single deck","greyhound");
    b.busDetails();
   
    }
    
}
