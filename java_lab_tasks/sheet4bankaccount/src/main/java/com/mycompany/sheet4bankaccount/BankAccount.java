/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sheet4bankaccount;

/**
 *
 * @author Anwar
 */
public class BankAccount {
     int previous =0;
    int balance =0;
    String customer_name;
    String customer_id;
    BankAccount(String cn , String ci){
        customer_name=cn;
        customer_id=ci;
                }
    void deposition(int amount){
     if(amount!=0){
     previous=amount;
     balance+=amount;
         System.out.println("the customer name is : "+customer_name+"/ customer id : "+customer_id);
         System.out.println("current balance is : "+balance);
     }
    }
    void withdraw(int amount){
    if(amount!=0&&amount<=balance){
    previous=(-amount);
    balance-=amount; 
             System.out.println("customer name :  " + customer_name + " customer id : "+customer_id);
    System.out.println("current balance is : "+balance);
    }
    }
void previoust(){
if(previous<0){
             System.out.println(" customer name : " + customer_name + " customer id : "+customer_id);

    System.out.println("the process is withdraw by value = "+Math.abs(previous));
}
else
{
          System.out.println("customer name : " + customer_name + " customer id : "+customer_id);
   System.out.println("the process is deposit by value = "+Math.abs(previous));
}}}
