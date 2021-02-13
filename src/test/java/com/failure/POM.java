package com.failure;

import java.sql.Driver;

import org.openqa.selenium.support.PageFactory;

public class POM  {
	public POM() {
	PageFactory.initElements(driver, this);
	}

}
