package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrml.utility.BaseClass;
import com.hrms.pages.DeleteEmployee;
import com.hrms.pages.LogOut;
import com.hrms.pages.LoginPage;

public class TC_103 {
	
	@Test
	public static void tc103() throws Throwable
	{
		DOMConfigurator.configure("log4j.xml");
		BaseClass.openApplication();
		LoginPage.login("NareshitDemo", "Demo@123");
		DeleteEmployee.deleteEmp("0149");
		LogOut.logout();
	    BaseClass.closeApp();
	}
	

}
