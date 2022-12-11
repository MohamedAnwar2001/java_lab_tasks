
package com.mycompany.sheet4bankaccount;

import java.util.Scanner;

/**
 *
 * @author Anwar
 */
public class Main {
    public static void main(String[] args) {
     System.out.println("please enter your name and id");
        Scanner input0=new Scanner(System.in);
        String cn =input0.next();
        String ci =input0.next();
        BankAccount a1=new BankAccount(cn,ci);
        System.out.println("enter 1 for deposit / 2 for withdraw / 3 for previous transaction / 4 for exit");
        Scanner input1=new Scanner(System.in);
        int x;
        do{
         x=input1.nextInt();
        switch(x){
            case 1:
                System.out.println("please enter the amount you want to deposit");
                Scanner input2=new Scanner(System.in);
                int amount1=input2.nextInt();
                a1.deposition(amount1);
                break;
            case 2:
                System.out.println("enter the amount you want to withdraw");
                Scanner input3=new Scanner(System.in);
                int amount2=input3.nextInt();
                a1.withdraw(amount2);
                break;
            case 3:
                a1.previoust();
                break;
        }
            System.out.println("press 4 for exit or choose a new process ");
        
        }while(x!=4);
    }
}
