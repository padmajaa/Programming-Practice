package com.java.strings;

public class StringBuilderCharat {
	public static void main(String[] args) {
	     StringBuilder sb = new StringBuilder("TEST STRING");
	 
	     System.out.println("String is: "+sb);
	 
	     for(int i=0; i<sb.length(); i++){
	         System.out.println("Character at index "+i+
	         " is: "+sb.charAt(i));
	     }
	  }
	}


