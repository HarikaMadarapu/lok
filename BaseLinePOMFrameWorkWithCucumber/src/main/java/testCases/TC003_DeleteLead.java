package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseUtils;
import pages.LoginPage;



public class TC003_DeleteLead extends BaseUtils {
	@BeforeTest
	public void setData() {
		excelFileName="/DeleteLead";
	}
@Test(dataProvider="harika2")
	public void deleteLead(String uname,String pw,String email) throws InterruptedException {
		new LoginPage().enterUserName(uname).enterPassword(pw).clickLogin().clickCRMSFA().clickLeads()
		.clickFindLead().switchtoEmail().enterEmail(email).clickonFindLeads().clickonTopLead().clickDelete();
		
	}
	
}

