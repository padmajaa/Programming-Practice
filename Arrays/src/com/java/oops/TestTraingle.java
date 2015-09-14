package com.java.oops;
public class TestTraingle {
	public class TestTriangle  {
	    private double side1 = 1.0;
	    private double side2 = 1.0;
	    private double side3 = 1.0;

	    public TestTriangle(double side12, double side22, double side32) {
			// TODO Auto-generated constructor stub
		}
		public void main(String[] args) {
	        System.out.println("Enter three sides of the Triangle");
	        System.out.println("Enter the color of the Triangle");
	        System.out.println(" Is the Triangle filled? Reply with 'True' or 'False' "); 
	    }
	    {
	        new TestTriangle(side1, side2, side3);
	        //How do i get the information into theTriangle?

	        System.out.println("The Triangle Sides are \n side 1: " + side1 + "\n Side 2: " + side2 + "\n Side 3: " + side3);
	        System.out.println("The Triangle's Area is " + (side1 + side2 + side3) / 2);
	        System.out.println("The Triangle's Perimeter is" +(side1 + side2 + side3));
	    }
	}
}
	        
	        


