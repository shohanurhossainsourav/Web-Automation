package com.bd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DiamondWorld extends BaseDriver{

	public static String baseUrl= "https://www.diamondworldltd.com";
	
	@Test (priority = 0)
	public void openUrl() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().window().maximize();
		Thread.sleep(3000); //1000 = 1s
	}
	
	@Test (priority = 1)
	public void Test() throws InterruptedException {
		WebElement kohinoor = driver.findElement(By.id("2e88ed29d59911ebb4050242e3cb0695"));
		//kohinoor.click();
		
		WebElement text = driver.findElement(By.xpath("//h4[contains(text(),'WELCOME TO DIAMOND WORLD')]"));
		System.out.println(text.getText());
		
		WebElement search = driver.findElement(By.className("searchIcon"));
		search.click();
		
		WebElement searchInput = driver.findElement(By.xpath("//input[@id='scroll_searchfield']"));
		searchInput.click();
		searchInput.clear();
		searchInput.sendKeys("Diamond");
		
		Thread.sleep(3000);
	}
}
