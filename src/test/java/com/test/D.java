package com.test;

import org.testng.annotations.Test;

public class D {
	@Test(groups="san")
	private void tc111() {
System.out.println("111");
	}
	@Test(groups="smoke")
	private void tc222() {
System.out.println("222");
	}
	@Test(groups="smoke")
	private void tc3() {
System.out.println("333");
	}
	@Test(groups="smoke")
	private void tc4() {
System.out.println("444");

}
}