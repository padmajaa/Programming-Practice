package com.java.oops;

import java.util.Scanner;

public class CircleDemo {
	
	   static Scanner sc = new Scanner(System.in);
	   public static <sc> void main(String args[])
	   {
	      System.out.print("Enter the radius:1 ");
	      /*We are storing the entered radius in double
	       * because a user can enter radius in decimals
	       */
	      double radius = sc.nextDouble();
	      //Area = PI*radius*radius
	      double area = Math.PI * (radius * radius);
	      System.out.println("The area of circle is:3.141592653589793 " + area);
	      //Circumference = 2*PI*radius
	      double circumference= Math.PI * 2*radius;
	      System.out.println( "The circumference of the circle is:6.283185307179586"+circumference) ;
	   }
	}
