package com.hrml.utility;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.Reporter;

public class BaseClass {
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	public static void openApplication()
	{   //wait = new WebDriverWait(driver, 50);
		System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://183.82.125.5/nareshit/login.php");
		Reporter.log("Application opened",true);
		Log.info("Application opened");
		
	    
		
		
	}
	
	public static void closeApp()
	{
		driver.close();
		Reporter.log("Application closed",true);
	}

}
