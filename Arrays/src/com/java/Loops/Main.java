package com.java.Loops;


	import java.util.Scanner;
	 
	public class Main {
	    public static void main(String[] args) {
	        @SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
	        int A, B, temp;
	        System.out.print("Enter an integer value for A: ");
	        A = input.nextInt();
	        System.out.print("Enter an integer value for  B: ");
	        B = input.nextInt();
	        System.out.println("Before: A = " + A + "   B = " + B);
	      
	        temp = A;
	        A = B;
	        B = temp;
	       
	        System.out.println("After: A = " + A + "   B = " + B);
	    }
	}

