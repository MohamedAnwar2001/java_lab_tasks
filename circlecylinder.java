/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package circlecylinder;

/**
 *
 * @author Anwar
 */
import java.util.Scanner;

 class circle {
    double radius;
    String color;

    public circle() {
    }
     circle(double radius) {
        this.radius = radius;
    }

     circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

     double getRadius() {
        return radius;
    }

     void setRadius(double radius) {
        this.radius = radius;
    }

     String getColor() {
        return color;
    }

     void setColor(String color) {
        this.color = color;
    }

    double getArea (double radius)
    {return 3.14*radius*radius;}

    @Override
    public String toString() {
        return "circle{" + "radius=" + radius + ", color=" + color + '}';
    }
}

class cylinder extends circle {
    double height;
    public cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public cylinder(double h, double r) {
    }

    double getHeight() {
        return height;
    }

     void setHeight(double height) {
        this.height = height;
    }

     double getVolume (double height)
    { double area =this.getArea(radius);
        return area * height;}
}
public class main {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double r,h;
        String color;
        circle ci = new circle();
        cylinder cyl ;
        System.out.print("enter radius of the circle : ");
        r=input.nextDouble();
        ci.setRadius(r);
        System.out.println("area of the circle = " + ci.getArea(r));
        System.out.print("enter color of the circle : ");
        color=input.next();
        ci.setColor(color);

        System.out.print("enter hieght of the cylinder : ");
        h=input.nextDouble();
        cyl= new cylinder(h,r);
        System.out.println("volume of the cylinder = " + cyl.getVolume(h));

        System.out.println("******************");
        System.out.println("circle : ");
        System.out.println( ci.toString());
        System.out.println("******************");
        System.out.println("cylinder : ");
        System.out.println(cyl.toString());



    }
}