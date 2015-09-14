package com.java.oops;


	import java.util.UUID;
	 
	public class Singleton {
	

	 

	     private static Singleton single = null;

	     private String ID = null;

	 

	     private Singleton() {

	          /* Make it private, in order to prevent the creation of new instances of

	           * the Singleton class. */

	          ID = UUID.randomUUID().toString(); // Create a random ID.

	     }
	 

	     public static Singleton getInstance() {

	          if (single == null)

	               single = new Singleton();
	 

	          return single;

	     }

	 

	     public String getID() {

	          return this.ID;

	     }

	
	
	     public static void main(String[] args) {

	          Singleton s = Singleton.getInstance();

	          System.out.println(s.getID());

	     }

	}



