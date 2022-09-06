package com.bd;

import org.testng.annotations.Test;

public class TitleVerify extends BaseDriver{

	public static String baseUrl= "https://www.aarong.com";
	public static String expectedTitle = "Aarong | Ethically made handcrafted products | A BRAC social enterprise";
	@Test (priority = 0)
	public void openUrl() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().window().maximize();
		Thread.sleep(5000); //1000 = 1s
		String actualTitle = driver.getTitle();
		System.out.println("Title: "+actualTitle);
		
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Title Match");
		}else {
			System.out.println("Title Not Match");
		}
	}
}
