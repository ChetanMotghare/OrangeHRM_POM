package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.hrml.utility.BaseClass;
import com.hrml.utility.Log;

public class DeleteEmployee extends BaseClass{

	//obj
	static By dropdown = By.id("loc_code");
	static By searchbox = By.id("loc_name");
	static By searchbtn = By.xpath("//input[@value='Search']");
	static By restable = By.className("data-table");
	static By  rows = By.tagName("tr");
	static By colms = By.tagName("td");
	static By checkbox = By.className("checkbox");
	static By deletebtn = By.xpath("//input[@value='Delete']");
	static String frame = "rightMenu";
	
	//method
	public static void deleteEmp(String empid )
	{
		driver.switchTo().frame(frame);                                //switch to iframe 
        Select choose = new Select(driver.findElement(dropdown));   //select dropdown list to get emp_id search box
        choose.selectByIndex(1);                                             //click on emp_id search
        driver.findElement(searchbox).sendKeys(empid);               //locate search box and enter empoyee id ,who we want ot delete .
        driver.findElement(searchbtn).click();                    //click on search button to get detail for search empid 
	    
       // getting employee detail  from table 
        
        List<WebElement> row = driver.findElement(restable).findElements(rows);    //getting all row value
        List<WebElement> col = row.get(1).findElements(colms);                                        //getting 2nd row collum value
                              WebElement idcheck =  col.get(0);                     //selecting search value
                              idcheck.findElement(checkbox).click(); //clicking on checkbox to delete
       
        driver.findElement(deletebtn).click();
       // System.out.println("Employee Delete Successfully");
        driver.switchTo().defaultContent();
        Reporter.log("Employee Delete Successfully");
        Log.info("Employee Delete Successfully");
		
	}
	
}