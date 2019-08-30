package pages;

import base.BaseUtils;

public class LoginPage extends BaseUtils {

	public LoginPage() {

	}
	public LoginPage enterUserName(String uname) {
		driver.findElementById("username").sendKeys(uname);
		return this;
	}
	/*public LoginPage enterUserName() {
		driver.findElementById("username").sendKeys("demosalesmanager");
		return this;
	}*/
	public LoginPage enterPassword(String pw) {
		driver.findElementById("password").sendKeys(pw);
		return this;
	}
	/*public LoginPage enterPassword() {
		driver.findElementById("password").sendKeys("crmsfa");
		return this;
	}*/
	public HomePage clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
		return new HomePage();
	}
}



