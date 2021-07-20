package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrml.utility.BaseClass;
import com.hrms.pages.AddEmployee;
import com.hrms.pages.LogOut;
import com.hrms.pages.LoginPage;

public class TC_102 {
	
	@Test
	public static void tc102() throws Throwable
	{
		DOMConfigurator.configure("log4j.xml");
		BaseClass.openApplication();
		LoginPage.login("NareshitDemo", "Demo@123");
	    AddEmployee.addEmployee("Motghare", "Chetan");
	    LogOut.logout();
	    BaseClass.closeApp();
	}

}
