package com.bd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class AssertionTest extends BaseDriver{

	public static String baseUrl= "https://www.aarong.com";
	public static String expectedTitle = "Aarong | Ethically made handcrafted products | A BRAC social enterprise";
	@Test (priority = 0)
	public void openUrl() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().window().maximize();
		Thread.sleep(5000); //1000 = 1s
		
		//Assertion -> 1. hard 2. Soft
		SoftAssert soft = new SoftAssert();
		String actualTitle = driver.getTitle();
		System.out.println("Title: "+actualTitle);
	    //Assert.assertEquals(actualTitle, expectedTitle); //Hard Assertion
		soft.assertEquals(actualTitle, expectedTitle); //Soft Assertion
		WebElement taaga =  driver.findElement(By.xpath("//a[@href='https://www.aarong.com/brand/taaga']"));
		taaga.click();
		soft.assertAll();
		Thread.sleep(5000);
	}
}
