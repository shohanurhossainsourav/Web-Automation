package com.bd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MoveToElement extends BaseDriver{
	
	public static String baseUrl = "https://www.shohoz.com/";
	
	@Test
	public void moveTo() throws InterruptedException {	
		driver.get(baseUrl);
		driver.manage().window().maximize();
		
		Actions actions = new Actions(driver);
		
		WebElement moveElement = driver.findElement(By.xpath("//a[contains(text(),'Privacy Policy')]"));
		actions.moveToElement(moveElement).perform();
		Thread.sleep(20000);
		
		
	}

}
