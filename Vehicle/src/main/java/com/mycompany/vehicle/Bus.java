/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehicle;

/**
 *
 * @author Anwar
 */
public class Bus extends Vehicle{
    
  private String busCompany;
  Bus(String make, String color, int year, String model,String busCompany){
      super( make,  color,  year,  model);
      this.busCompany = busCompany;
      
  }
  public void busDetails(){
      printDetails();//invoking the super class method
      System.out.println(" Bus company :"+busCompany);
  }
}
