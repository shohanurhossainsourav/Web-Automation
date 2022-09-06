package com.bd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Navigate extends BaseDriver{

	public static String baseUrl= "https://the-internet.herokuapp.com/";
	
	@Test
	public void openUrl() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().window().maximize();
		Thread.sleep(3000); //1000 = 1s
		
		WebElement text = driver.findElement(By.xpath("//a[contains(text(),'Context Menu')]"));
		text.click();
		Thread.sleep(10000);
		
		driver.navigate().back();
		Thread.sleep(10000);
		
		driver.navigate().forward();
		Thread.sleep(10000);
	}
}
