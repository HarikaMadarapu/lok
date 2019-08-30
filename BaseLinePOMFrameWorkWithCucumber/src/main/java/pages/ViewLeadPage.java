package pages;

import base.BaseUtils;


public class ViewLeadPage extends BaseUtils {

	public ViewLeadPage() {
		
	}
	public ViewLeadPage clickOnEditButton() {
		driver.findElementByLinkText("Edit").click();
		return this;
	}
	public ViewLeadPage clear_companyName() {
		driver.findElementById("updateLeadForm_companyName").clear();
		return this;
	}

	
	public ViewLeadPage enter_companyName(String nCName) {
		driver.findElementById("updateLeadForm_companyName").sendKeys(nCName);
		return this;
	}

	
	public ViewLeadPage click_on_Update() {
		driver.findElementByXPath("//input[@value='Update']").click();
		return this;
		}
	public ViewLeadPage updated() {
		String attribute = driver.findElementById("viewLead_companyName_sp").getText();
		System.out.println("Comapny Name "+attribute);
		if(attribute.contains("TestLeaf"))
			System.out.println("Company name Updated");
		else
			System.out.println("Company name not updated");
		driver.close();
		return this;
	}
	public ViewLeadPage clickDelete() {
		//driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		driver.findElementByClassName("subMenuButtonDangerous").click();
		//driver.findElementByXPath("(//div[@class='frameSectionBody']//a)[3]").click();
		System.out.println("record deleted");
		
		
		
		return this;
	}
	
}
