package com.test;

import org.testng.annotations.Test;
// PULL from master
public class C {
	@Test(groups="smoke")
	private void tc11() {
System.out.println("11");
	}
	@Test(groups="reg")
	private void tc22() {
System.out.println("22");
	}
	@Test(groups="san")
	private void tc33() {
System.out.println("33");
	}
	@Test(groups="reg")
	private void tc44() {
System.out.println("44");

}
}
