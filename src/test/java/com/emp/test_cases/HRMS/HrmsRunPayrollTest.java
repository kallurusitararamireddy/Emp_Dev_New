package com.emp.test_cases.HRMS;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;
import com.emp.qa.pages.HRMS.HrmsRunPayrollPage;


public class HrmsRunPayrollTest extends TestBase {
	@Test
	public void HrmsRunPayrollTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsRunPayrollPage runpayrollPage = new HrmsRunPayrollPage(getDriver());
		homePage.SkipPopup();
		runpayrollPage.HrmsRunPayrollPage();
	}


}
