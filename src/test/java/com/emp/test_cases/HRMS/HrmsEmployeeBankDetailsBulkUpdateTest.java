package com.emp.test_cases.HRMS;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;
import com.emp.qa.pages.HRMS.HrmsEmployeeBankDetailsBulkUpdatePage;


public class HrmsEmployeeBankDetailsBulkUpdateTest extends TestBase {
	@Test
	public void HrmsEmployeeBankDetailsBulkUpdateTest() throws InterruptedException, IOException, AWTException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsEmployeeBankDetailsBulkUpdatePage BankBulk = new HrmsEmployeeBankDetailsBulkUpdatePage(getDriver());
		homePage.SkipPopup();
		BankBulk.HrmsEmployeeBankDetailsBulkUpdatePage();
	}

}
