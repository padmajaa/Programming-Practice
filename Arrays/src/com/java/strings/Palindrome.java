package com.java.strings;

public class Palindrome {
	
		
	static public String pal(String str, int i, int j){
		if(str.length()/2 != i)
		if(str.charAt(i)==str.charAt(j))
		pal(str,++i,--j);
		else
		return	"String is Not palaindrome";

		return "String is palaindrome";
		}
		public static void main(String[] args) {
		String str = args[0];
		System.out.println(pal(str,0,str.length()-1));
		}
}
		



