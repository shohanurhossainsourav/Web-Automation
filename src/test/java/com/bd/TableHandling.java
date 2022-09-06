package com.bd;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TableHandling extends BaseDriver{
	
	public static String baseUrl = "https://testautomationpractice.blogspot.com/";
	
	@Test
	public void hoverTest() throws InterruptedException {	
		driver.get(baseUrl);
		driver.manage().window().maximize();
		
		Actions actions = new Actions(driver);
		
		WebElement moveElement = driver.findElement(By.xpath("//table[@name='BookTable']"));
		actions.moveToElement(moveElement).perform();
		Thread.sleep(5000);
		
		List<WebElement> headerlist = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[1]/th"));
		System.out.println("Value Size: "+headerlist.size());
		
		List<WebElement> tableList = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
		System.out.println("Size: "+tableList.size());
		
		List<WebElement> valuelist = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[2]/td"));
		System.out.println("Value Size: "+valuelist.size());
		
		for (int h = 1; h <= headerlist.size(); h++) {
			WebElement header = driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[1]/th["+h+"]"));
		    System.out.print(header.getText()+" | ");
		}
		System.out.println();
		for (int i = 2; i <= tableList.size(); i++) {
			WebElement bookName	= driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+i+"]/td[1]"));
			for (int j = 1; j <= valuelist.size(); j++) {
				WebElement value = driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+i+"]/td["+j+"]"));
			    System.out.print(value.getText()+" | ");
			}
			System.out.println();
			//System.out.println(bookName.getText());
		}
	}

}
