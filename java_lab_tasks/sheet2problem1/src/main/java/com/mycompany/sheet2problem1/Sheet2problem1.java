/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sheet2problem1;

import java.util.Scanner;

/**
 *
 * @author Anwar
 */
public class Sheet2problem1 {

    public static void main(String[] args) {
        /* Java Program that find the largest
        element in an array using a for loop in Java..
        */
     int n, max;
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the size of the array:");
    n = s.nextInt();
    int a[] = new int[n];
    System.out.println("Insert the elements of array:");
    for(int i = 0; i < n; i++)
    {
    a[i] = s.nextInt();
    }
    max = a[0];
    for(int i = 0; i < n; i++)
    {
    if(max < a[i])
    {
    max = a[i];
    }
    }
    System.out.println("Maximum value in the array is:"+max);
    }
  }
