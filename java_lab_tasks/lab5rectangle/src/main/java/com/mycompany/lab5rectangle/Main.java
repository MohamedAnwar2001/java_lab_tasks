/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab5rectangle;

/**
 *
 * @author Anwar
 */
public class Main {
    /*Create a class rectangle and use inheritance to create another
    class cuboid, add methods Area and volume to them, try to keep it as close to the
    real-world scenario as possible*/

    public static void main(String[] args) {
        Rectangle a1= new Rectangle(10,20);
        System.out.println(" area of the rectangle = " + a1.Area());
        Cuboid a2= new Cuboid (4,2,3);
        System.out.println(" Voulme of the cuboid = " +a2.volume());
    }
}
