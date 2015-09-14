package com.java.oops;

class MethodOverload {
	public static void main(String[] args) {
	} 	

void triangleArea(float base, float height) 
{ 
      float area; 
      area = base * height / 2.0f; 
      System.out.println(area =  + area);
}

void triangleArea(float side1, float side2, float side3) 
{ 
         float area;
		double s; 
         s = (side1 + side2 + side3) / 2.0; 
         area = (float) Math.sqrt(s*(s-side1) * (s-side2) * (s-side3) ); 
         System.out.println(area = + area);
}
 }

