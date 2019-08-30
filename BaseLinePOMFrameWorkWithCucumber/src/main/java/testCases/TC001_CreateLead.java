package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseUtils;
import pages.LoginPage;

public class TC001_CreateLead extends BaseUtils {
	
	@BeforeTest
	public void setData() {
		excelFileName="/CreateLead1";
		
	}
	@Test(dataProvider="harika",enabled=false)
	public void createLead(String uname,String pw,String cName, String fName,String lName) {
		new LoginPage().enterUserName(uname).enterPassword(pw).clickLogin().clickCRMSFA().clickLeads().clickCreateLead()
		.enterCName(cName).enterfName(fName).enterLName(lName).clickSubmit();


	}
	/*public void EditLead(String uname,String pw,String email,String nCName) throws InterruptedException {
		new LoginPage().enterUserName(uname).enterPassword(pw).clickLogin().clickCRMSFA().clickLeads().clickFindLead()
		.switchtoEmail().enterEmail(email).clickonFindLeads().clickonTopLead().clickOnEditButton().clear_companyName()
		.enter_companyName(nCName).click_on_Update().updated();
	}*/
}
