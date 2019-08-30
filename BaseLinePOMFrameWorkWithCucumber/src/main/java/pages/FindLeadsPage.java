package pages;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseUtils;

public class FindLeadsPage extends BaseUtils {

	public FindLeadsPage() {
		
	}
	public FindLeadsPage switchtoEmail() {
		driver.findElementByXPath("(//span[@class='x-tab-strip-text '])[3]").click();
		return this;
	}
	public FindLeadsPage enterEmail(String email) {
		driver.findElementByName("emailAddress").sendKeys(email);
		return this;
	}
	
	public FindLeadsPage clickonFindLeads() throws InterruptedException {
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		return this;
	}
	public ViewLeadPage clickonTopLead() throws InterruptedException {
		Thread.sleep(500);//WebDriverWait
		WebDriverWait wait=new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")));
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		return new ViewLeadPage();
	}
	
	
}
