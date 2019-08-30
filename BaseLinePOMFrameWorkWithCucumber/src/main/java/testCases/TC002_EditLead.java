package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseUtils;
import pages.LoginPage;

public class TC002_EditLead extends BaseUtils{
	@BeforeTest
	public void setData() {
		excelFileName="/EditLead";

	}
	@Test(dataProvider="harika1",enabled=false)
	public void EditLead(String uname,String pw,String email,String nCName) throws InterruptedException {
		new LoginPage().enterUserName(uname).enterPassword(pw).clickLogin().clickCRMSFA().clickLeads().clickFindLead()
		.switchtoEmail().enterEmail(email).clickonFindLeads().clickonTopLead().clickOnEditButton().clear_companyName()
		.enter_companyName(nCName).click_on_Update().updated();
	}
}
