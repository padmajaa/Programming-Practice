package com.java.strings;

public class reverseString {
	public static void main(String [] args) {

	    String s = "reverse string" ;
	    String b = "";

	            for (int i = 0; i < s.length(); i++ ){
	                 b= b + s.substring(s.length()-1-i, s.length()-i);

	                 }

	             System.out.println(b);
	}
}	