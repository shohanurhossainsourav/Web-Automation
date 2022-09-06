package com.bd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RadioAndCheckButton extends BaseDriver{

	public static String baseUrl= "https://codenboxautomationlab.com/practice/";
	
	@Test
	public void openUrl() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().window().maximize();
		Thread.sleep(2000); //1000 = 1s
		
		WebElement radio2Button = driver.findElement(By.xpath("//input[@value='radio2']"));
		radio2Button.click();
		
		WebElement checkbox1 = driver.findElement(By.id("checkBoxOption1"));
		checkbox1.click();
		
		WebElement checkbox3 = driver.findElement(By.id("checkBoxOption3"));
		checkbox3.click();
		
		Thread.sleep(5000);
	}
}
