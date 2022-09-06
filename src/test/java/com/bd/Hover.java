package com.bd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Hover extends BaseDriver{
	
	public static String baseUrl = "https://demoqa.com/menu";
	
	@Test
	public void hoverTest() throws InterruptedException {	
		driver.get(baseUrl);
		driver.manage().window().maximize();
		
		Actions actions = new Actions(driver);
		
		WebElement menuOption = driver.findElement(By.xpath("//a[contains(text(),'Main Item 2')]"));
		actions.moveToElement(menuOption).perform();
		Thread.sleep(3000);
		
		WebElement subMenuOption = driver.findElement(By.xpath("//a[contains(text(),'SUB SUB LIST »')]"));
		actions.moveToElement(subMenuOption).perform();
		Thread.sleep(3000);
		
		WebElement selectMenuOption = driver.findElement(By.xpath("//a[contains(text(),'Sub Sub Item 2')]"));
		selectMenuOption.click();
		Thread.sleep(3000);
	}

}
