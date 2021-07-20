package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrml.utility.BaseClass;
import com.hrms.pages.LogOut;
import com.hrms.pages.LoginPage;
import com.hrms.pages.VerifyPage;

public class TC_101 {
	//TEST CASE STEPS
	@Test
	public static void tc101() throws Throwable
	{
		DOMConfigurator.configure("log4j.xml");
		BaseClass.openApplication();
		VerifyPage.verifyTitle("HRMS");
		LoginPage.login("NareshitDemo", "Demo@123");
	    VerifyPage.verifyTitle("OrangeHRM");
	    LogOut.logout();
	    BaseClass.closeApp();
	}

}
