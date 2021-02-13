package com.test;

import static org.testng.Assert.assertTrue;

import org.junit.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Employee {
	@Test()
	private void tc1() {
		System.out.println("Kodambakkam");

	}

	@Test
	private void tc2() {
		System.out.println("Omr");

		System.out.println("ecr");
		Assert.assertTrue(false);
		System.out.println("pondicheery");

		System.out.println("Vadapalani");

	}

	@Test
	private void tc3() {
		System.out.println("valasaravakkam");
		SoftAssert a = new SoftAssert();

		a.assertEquals("java", "Java");

		// Assert.assertTrue(false);
		System.out.println("Banglore");
		a.assertAll();
	}

	@Test(invocationCount = 2)
	private void tc4() {
		System.out.println("porur");

	}

	@Test
	private void tc5() {
		System.out.println("ashoknagar");

	}

}
