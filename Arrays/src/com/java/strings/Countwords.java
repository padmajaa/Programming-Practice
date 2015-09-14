package com.java.strings;
import java.io.*; 
import java.util.regex.*; 

class NumberOfWords { 
public static void main(String args[]) throws Exception { 
FileReader fr = new FileReader("File7.txt"); 
BufferedReader br = new BufferedReader(fr); 
String str = null; 
int count = 0; 
while ((str = br.readLine()) != null) { 
Pattern pat = Pattern.compile("[ ,.,,,;]"); 
String str1[] = pat.split(str); 
count = count + str1.length; 
} 
System.out.println("the no of words in the file are " + count); 
br.close(); 
 
 }
} 

				

