/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sheet2problem2;

/**
 *
 * @author Anwar
 */
public class Sheet2problem2 {
        /* For student: write a program to find the 
        transpose of a 2D array.*/
    public static void main(String[] args) {
        int x[][]={
           {1,2,3},{4,5,6},{7,8,9}
       };
       for (int row =0;row<x.length; row++){
           for(int col=0;col<x[row].length;col++){
                System.out.print(x[row][col] + " ");
            }
             System.out.println();//new line
        }
       // printing the array itself before transposing
      
        System.out.println("...........");// prints .....
        System.out.println("...........");
        
       for (int row =0;row<3; row++){
           
           for(int col=0;col<3;col++){
                System.out.print(x[col][row] + " ");
            }
             System.out.println();//new line
      }
    }
}
