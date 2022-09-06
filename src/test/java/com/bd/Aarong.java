package com.bd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Aarong extends BaseDriver{
	
	public static String baseUrl= "https://www.aarong.com";
	
	@Test (priority = 0)
	public void openUrl() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().window().maximize();
		Thread.sleep(5000); //1000 = 1s
	}
	
	@Test (priority = 2)
	public void Test() throws InterruptedException {
		WebElement taaga =  driver.findElement(By.xpath("//a[@href='https://www.aarong.com/brand/taaga']"));
		taaga.click();
		Thread.sleep(5000);
	}
	
	@Test (priority = 1)
	public void Test2() throws InterruptedException {
		WebElement taaga =  driver.findElement(By.xpath("//header/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]"));
		taaga.click();
		Thread.sleep(5000);
	}

}
