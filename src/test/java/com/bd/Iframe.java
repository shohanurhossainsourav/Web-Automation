package com.bd;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Iframe extends BaseDriver{

	public static String baseUrl= "https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html";
	
	@Test
	public void openUrl() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().window().maximize();
		Thread.sleep(3000); //1000 = 1s
		//WebElement frameNumebers = (WebElement) driver.findElements(By.tagName("iframe")).size();
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		
		driver.switchTo().frame("packageListFrame");
		WebElement firstFrametext = driver.findElement(By.xpath("//body/main[1]/ul[1]/li[1]/a[1]"));
		Thread.sleep(1000);
		firstFrametext.click();
		Thread.sleep(5000);
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame("packageFrame");
		WebElement secondFrametext = driver.findElement(By.xpath("//span[contains(text(),'Alert')]"));
		Thread.sleep(1000);
		secondFrametext.click();
		
		Thread.sleep(3000);
		
		
	}
}
