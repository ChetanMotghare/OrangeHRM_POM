package com.hrms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import org.testng.Reporter;

import com.hrml.utility.BaseClass;
import com.hrml.utility.Log;

public class LogOut extends BaseClass {
	
	//obj 
	static By link_logout = By.xpath("//a[text()='Logout']");

	//method
	
	public static void logout() 
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(link_logout)).sendKeys(Keys.ENTER).build().perform();
		
		//driver.findElement(link_logout).sendKeys(Keys.ENTER);
		Reporter.log("Logout Completed",true);
		Log.info("Logout Completed");
	}
}
