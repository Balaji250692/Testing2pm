package com.test;

import org.testng.annotations.Test;

public class B {
	@Test(groups="smoke")
	private void tc1() {
System.out.println("1");
	}
	@Test(groups="san")
	private void tc2() {
System.out.println("2");
	}
	@Test(groups="reg")
	private void tc3() {
System.out.println("3");
	}
	@Test(groups="smoke")
	private void tc4() {
System.out.println("4");
	}

}
