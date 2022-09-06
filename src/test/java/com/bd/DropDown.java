package com.bd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown extends BaseDriver{

	public static String baseUrl= "https://qavbox.github.io/demo/signup/";
	
	@Test
	public void openUrl() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().window().maximize();
		Thread.sleep(3000); //1000 = 1s
		
		WebElement gender = driver.findElement(By.xpath("//select[@name='sgender']"));
		//Select by Value, visible Text, index
		Select genderSelect = new Select(gender);
		
		//genderSelect.selectByValue("male");
		//genderSelect.selectByIndex(3);
		genderSelect.selectByVisibleText("Female");
		Thread.sleep(10000);
		
		
	}
}
