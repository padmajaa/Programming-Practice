package com.java.General;

public class RuntimeDemo {
	

		   public static void main(String[] args) {

		   // print when the program starts
		   System.out.println("Program starting...");

		   // run the garbage collector
		   System.out.println("Running Garbage Collector...");
		   Runtime.getRuntime().gc();
		   System.out.println("Completed.");
		   }
		}

