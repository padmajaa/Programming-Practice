package com.java.arrays;

public class FindLargest {
	
	
	public static int Findmax(int[] arr){
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i]){
				max=arr[i];
			}
			
		}
		return max;
	}

	public static void main(String[] args) {
		//FindLargest fl=new FindLargest();
		int[] arr={100,20,80,40,70};
		System.out.println(FindLargest.Findmax(arr));
		System.out.println("100");
		System.out.println("Hi there");
		
	}

	

}
