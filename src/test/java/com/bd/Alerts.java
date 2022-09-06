package com.bd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Alerts extends BaseDriver{

	public static String baseUrl= "https://the-internet.herokuapp.com/javascript_alerts";
	
	@Test
	public void openUrl() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().window().maximize();
		Thread.sleep(1000); //1000 = 1s
		
		WebElement clickforJSAlert = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]"));
		clickforJSAlert.click();
		String alertMessage = driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
//		
//		Thread.sleep(3000);
//		
//		WebElement clickforJSConfirm = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]"));
//		clickforJSConfirm.click();
//		Thread.sleep(3000);
//		driver.switchTo().alert().dismiss();
		
//		WebElement clickforJSPromt = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]"));
//		clickforJSPromt.click();
//		Thread.sleep(3000);
//		driver.switchTo().alert().sendKeys("Hello Alert");
//		Thread.sleep(5000);
//		driver.switchTo().alert().accept();
		
		Thread.sleep(5000);
	}
}
