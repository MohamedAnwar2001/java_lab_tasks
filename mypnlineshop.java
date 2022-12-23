
package myonlineshop;

/**
 *
 * @author Anwar
 */
import java.util.Scanner;
abstract  class product {
    double price;
    public abstract double price (double p);

}

 class book extends product {
    
    @Override
    public double price(double p)
    {   price=p*1;
        return price; }
}
//////////////////////////////


class childrenbook extends book {
   
    @Override
    public double price(double p)
    {   price=p*0.7;// discount for children price
        return price; }

}
public class Onlineshop {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Please enter number of books : ");
        int size=in.nextInt();
        product [] arr=new childrenbook[size];
        double price;
        double total=0;
        for(int i=0; i<size;i++)
        { System.out.print("Enter price of the book "  +(i+1)+  ": ");
            price=in.nextDouble();
            arr[i]=new childrenbook();
            arr[i].price(price);
            total =total + arr[i].price(price);
        }
        System.out.print("the total prices of the books :"+total);
    }
}