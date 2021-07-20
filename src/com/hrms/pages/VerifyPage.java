package com.hrms.pages;


import org.testng.Reporter;

import com.hrml.utility.BaseClass;

public class VerifyPage extends BaseClass {
	
	public static void verifyTitle(String title)
	{
		if(driver.getTitle().equals(title))
		{
			Reporter.log("Title Matched",true);
		}
		else{
			Reporter.log("Title not matched and expected title is " + driver.getTitle());
		}
	}

}
