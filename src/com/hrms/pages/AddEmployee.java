package com.hrms.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.hrml.utility.BaseClass;
import com.hrml.utility.Log;

public class AddEmployee extends BaseClass {
	
	//obj 
	  static By click_pimlink = By.xpath("//span[text()='PIM']");
	  static By Click_addEmplink = By.xpath("//a[@class='l2_link empadd']");
  //  static By switch_frame = By.
	  static By enter_lastname = By.id("txtEmpLastName");
	  static By enter_firstname = By.name("txtEmpFirstName");
	  static By click_addbtn = By.id("btnEdit");
	  static By frame = By.xpath("//iframe[@name='rightMenu']");
	  
	  
	  //method
	  
	  public static void addEmployee(String lastname,String firstname) throws InterruptedException
	  {
		   //use action class to navigate to PIM module 
	        Actions act = new Actions(driver);    //use of action class for mouse hover
	        Thread.sleep(2000);
	        
	        act.moveToElement(driver.findElement(click_pimlink)).build().perform();                        //move mouse to PIM link
	        act.click(driver.findElement(Click_addEmplink)).build().perform();
	        Thread.sleep(5000);
	     // add required field in employee page
	        
	        driver.switchTo().frame(driver.findElement(frame));
	        //String empid = driver.findElement(By.id(empid_capture)).getAttribute("value");  //capturing empployee id value to verify employee addes succefully or not
	        //System.out.println(empid);                                                        //store employee id for verfification 
	        Thread.sleep(5000);
	        wait = new WebDriverWait(driver, 50);
	        wait.until(ExpectedConditions.visibilityOf(driver.findElement(enter_lastname)));
	        driver.findElement(enter_lastname).sendKeys(lastname);                   //entering Last name
	        wait.until(ExpectedConditions.visibilityOf(driver.findElement(enter_firstname)));
	       driver.findElement(enter_firstname).sendKeys(firstname);                 //entering first name
	       wait.until(ExpectedConditions.elementToBeClickable(click_addbtn));
	       driver.findElement(click_addbtn).sendKeys(Keys.ENTER);
	       driver.switchTo().defaultContent();
	       Reporter.log("Employee Added Successfully",true);
	       Log.info("Employee Added Successfully");
	       
	  }
	  
}
