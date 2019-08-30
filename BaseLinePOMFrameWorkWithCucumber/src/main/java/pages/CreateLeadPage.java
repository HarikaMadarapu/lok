package pages;

import base.BaseUtils;

public class CreateLeadPage extends BaseUtils {

	public CreateLeadPage() {
		
	}
	public CreateLeadPage enterCName(String cname) {
		driver.findElementById("createLeadForm_companyName").sendKeys(cname);
		return this;
	}
	public CreateLeadPage enterfName(String fname) {
		driver.findElementById("createLeadForm_firstName").sendKeys(fname);
		return this;
	}
	public CreateLeadPage enterLName(String lname) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lname);
		return this;
	}
	public ViewLeadPage clickSubmit() {
		driver.findElementByName("submitButton").click();
		return new ViewLeadPage();
	}
}
