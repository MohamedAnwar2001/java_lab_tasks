
package com.mycompany.sheet1ncr_npr;

import java.util.Scanner;

/**
 *
 * @author Anwar
 */
public class Sheet1ncr_npr {
    /*
    Write java program that find and prints nCr (Combination) and nPr (Permutation)
    based on the n and r value entered by user at run-time of the program.
    */

    public static void main(String[] args) {
        int fact=1;
       Scanner s=new Scanner(System.in);
       System.out.print(" Please Enter the Value of n: ");
       int n =s.nextInt();
        Scanner m=new Scanner(System.in);
        System.out.print("Please Enter the Value of r: ");
       int r = m.nextInt();
       
       for(int i=1;i<=n;i++)
       {
       fact=fact*i;
       }
       int factn=fact;
        fact=1;
       for(int i=1;i<=r;i++)
       {
       fact=fact*i;
       }
       int factr;
       factr=fact;
       fact=1;
       int sub ;
       sub = n-r;
       for(int i=1;i<=sub;i++)
       {
       fact=fact*i;
       }
       int factsub = fact;
       float nCr,nPr;
       nPr=factn/factsub;
       nCr=factn/(factr*factsub);
       System.out.println(" nPr = "+nPr);
       System.out.println("nCr ="+nCr);
       
    }
}
