package com.failure;

import org.junit.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AutomaticRerun {
	@Test
	private void tc1() {
		System.out.println("Line1");
		System.out.println("Line2");
		System.out.println("Line3");
		
		

	}
	@Test(retryAnalyzer=Detected.class)
	private void tc2() {
		System.out.println("Line4");
		SoftAssert as = new SoftAssert();
		Assert.assertTrue(false);
		as.assertAll();
		
		System.out.println("Line5");
		System.out.println("Line6");
		

}
	@Test
	private void tc3() {
		System.out.println("Line7");
		System.out.println("Line8");
		System.out.println("Line9");
		
		
	}
}