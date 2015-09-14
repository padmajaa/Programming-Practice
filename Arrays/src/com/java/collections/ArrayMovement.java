package com.java.collections;

public class ArrayMovement {
	@SuppressWarnings("unused")
	private static void myTrans(int[] m){
	    int n = (m.length - 1);

	    int i = 1;
	    for (int start = 1; start < n; start++) {
	        int temp = m[start];
	        m[start] = m[n / 2 + i];

	        for (int j = (n / 2 + i); j > start; j--) {
	            m[j] = m[j - 1];
	        }

	        start++;
	        m[start] = temp;
	        printArray(m);
	        i++;
	    }
	}

	private static void printArray(int[] m) {
		// TODO Auto-generated method stub
		
	}
}
