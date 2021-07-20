package com.hrms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Reporter;

import com.hrml.utility.BaseClass;
import com.hrml.utility.Log;

public class LoginPage extends BaseClass{
	
	//obj
	
	static By txt_username = By.name("txtUserName");
	static By txt_password = By.name("txtPassword");
	static By btn_login = By.className("button");
	
  //method
	
	public static void login(String uid,String pwd) throws Throwable
	{
		driver.findElement(txt_username).sendKeys(uid);
		driver.findElement(txt_password).sendKeys(pwd);
		driver.findElement(btn_login).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		Reporter.log("Login Completed");
		Log.info("Login Completed");
	}
}
