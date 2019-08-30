package pages;

import base.BaseUtils;

public class MyHomePage extends BaseUtils {
	public MyHomePage() {

	}
	public MyLeadsPage clickLeads() {
		driver.findElementByLinkText("Leads").click();
		return new MyLeadsPage();
	}
}
