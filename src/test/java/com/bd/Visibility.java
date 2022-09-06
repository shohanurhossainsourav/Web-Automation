package com.bd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Visibility extends BaseDriver{
	
	public static String baseUrl = "https://www.apple.com/";
	
	@Test
	public void moveTo() throws InterruptedException {	
		driver.get(baseUrl);
		driver.manage().window().maximize();
		
		Actions actions = new Actions(driver);
		
		WebElement moveElement = driver.findElement(By.xpath("//a[contains(text(),'Privacy Policy')]"));
		
//		if (moveElement.isDisplayed()) {
//			actions.moveToElement(moveElement).perform();
//		} else {
//			System.out.println("Location not locatable");
//
//		}
		
		Assert.assertTrue(moveElement.isDisplayed());
		
		actions.moveToElement(moveElement).perform();
		Thread.sleep(10000);
		
		
	}

}
