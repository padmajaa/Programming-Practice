package com.java.arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLargest {
	
	
	
	@Test
	public void testmax()
	{
		int [] a={5,7,3,2,1};
		int actual=FindLargest.Findmax(a);
		int expected=7;
		Assert.assertEquals(actual, expected);
		
	}

	

}
