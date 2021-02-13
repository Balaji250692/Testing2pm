package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.json.StaticInitializerCoercer;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
	public static WebDriver driver;

	@Parameters({ "email", "pass" })
	@Test
	private void tc1(String email, String pass) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\god\\Desktop\\Balaji\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys(email);
		WebElement txtpass = driver.findElement(By.id("email"));
		txtpass.sendKeys(pass);

	}

}
