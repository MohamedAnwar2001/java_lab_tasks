
package com.mycompany.sheet1problem1;
import java.util.Scanner;

/**
 *
 * @author Anwar
 */
public class Sheet1problem2 {
    public static void main(String[] args) {
        /*
        Program to find and prints the character whose ASCII value
        will get entered by user at run-time.
        */
     Scanner input = new Scanner(System.in);
     System.out.print(" Please Enter the ASCII Value: ");
    int x = input.nextInt();// x is a variable for the the ascii value
    char ch = (char)x;
    System.out.println("\n The character is \'" +ch+ "\'");
      }
}
