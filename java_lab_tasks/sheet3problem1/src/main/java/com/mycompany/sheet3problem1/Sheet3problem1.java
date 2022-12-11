/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sheet3problem1;

import java.util.Scanner;

/**
 *
 * @author Anwar
 */
public class Sheet3problem1 {
        /* For student: write a program to remove all 
        coma ( , ) in a given string from the user. */

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println(" Enter original phrase ");
         String  sentence =s.nextLine();
            String str=sentence.replace(",", " ");
            System.out.println(str);
    }
}
