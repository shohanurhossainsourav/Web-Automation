package com.bd;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TabHandling extends BaseDriver{
	
	public static String baseUrl = "https://www.daraz.com.bd/";
	public static String baseUrl2 = "https://demoqa.com/menu";
	
	@Test (priority = 0)
	public void hoverTest() throws InterruptedException {	
		driver.get(baseUrl);
		driver.manage().window().maximize();
		
		Actions actions = new Actions(driver);
		
		WebElement moveElement = driver.findElement(By.xpath("//span[contains(text(),'Trending Now')]"));
		actions.moveToElement(moveElement).perform();
		Thread.sleep(5000);		
	}
	
	@Test (priority = 1)
	public void switchToNewTab() throws InterruptedException {	
		driver.switchTo().newWindow(WindowType.TAB);
		//driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get(baseUrl2);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.switchTo().window(windowHandling().get(0));	
		Thread.sleep(3000);
	}
	
	public List<String> windowHandling(){
		//Get all window handles and hold them in a list
		Set<String> windowHandles = driver.getWindowHandles();
		ArrayList<String> windowHandlesList = new ArrayList<String>(windowHandles);
        //System.out.println(windowHandlesList);
		
		//Write to total window handle number to the console
		//@SuppressWarnings("unused")
		int size = windowHandlesList.size();
		System.out.println(size);
		return windowHandlesList;
	
	}



}
