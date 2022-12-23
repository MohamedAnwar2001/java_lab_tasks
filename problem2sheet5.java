/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author Anwar
 */
import java.util.Scanner;

 interface Product {
     public abstract double price (double p);
    
}

 class book implements Product {
    double price;
    @Override
    public double price(double p) {
        price=p;
        return price;
    }

}

 class cartoonbook extends childbook {
    double price;

    @Override
    public double price(double p)
    {   price=p*0.5;
        return price; }
}
 class childbook extends book {
    double price;

    @Override
    public double price(double p)
    {   price=p*0.3;
        return price; }
}
public class problem2sheet5 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("please enter number of books : ");
        int size=input.nextInt();
        Product [] arr=new cartoonbook[size];


        double price;
        double total=0;
        for(int i=0; i<size;i++)
        { System.out.print("enter price of the book "  +(i+1)+  ": ");
            price=input.nextDouble();
            arr[i]=new cartoonbook();
            arr[i].price(price);
            total =total + arr[i].price(price);

        }
        System.out.print("total prices of the books :"+total);
    }
}