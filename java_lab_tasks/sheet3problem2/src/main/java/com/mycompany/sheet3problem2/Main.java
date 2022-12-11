/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sheet3problem2;

import java.util.Scanner;

/**
 *
 * @author Anwar
 */
public class Main {
    /*write a program that have two classes to find and prints area and circumference
    of triangle and circle, and the third class is the main class to create objects from these two
    classes*/
    public static void main(String[] args) {
        
   Scanner s = new Scanner(System.in);
    System.out.println(" Enter the reduis of the circle :");
   float reduis = s.nextFloat();
        Circle obj1 = new Circle();
        obj1.circleArea(reduis);
        obj1.circleCircumference(reduis);
        System.out.println();// new line
        System.out.println(" Enter length of the first side of triangle :  ");
        float x =s.nextInt();
        System.out.println(" Enter length of the second side of triangle :  ");
        float y = s.nextInt();
        System.out.println(" Enter length of the base of triangle :  ");
        float base =s.nextInt();
        Triangle obj2 =new Triangle();
        obj2.setX(x);
        obj2.setY( y);
        obj2.setB(base);
        obj2.triCircumference(x, y, base);
        System.out.println();
        System.out.println("Enter the height of triangle");
        float height=s.nextFloat();
        obj2.triArea(base, height);
}
    }

