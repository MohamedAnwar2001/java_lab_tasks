
package com.mycompany.lab5rectangle;

public class Cuboid extends Rectangle{
   int height;
   Cuboid (){
       System.out.println(" no argument constructor of subclass");
            }
    Cuboid(int length,int width,int height){
     super(length,width);
     this.height=height;
 }
 public double volume(){
     return length*width*height;
 }
}

