package pages;

import base.BaseUtils;

public class MyLeadsPage extends BaseUtils {
	public MyLeadsPage() {
	}

	public CreateLeadPage clickCreateLead() {
		driver.findElementByLinkText("Create Lead").click();
		return new CreateLeadPage();
	}
public FindLeadsPage clickFindLead() {
	driver.findElementByXPath("(//div[@class='frameSectionBody']//a)[3]").click();
	return new FindLeadsPage();
}
}
