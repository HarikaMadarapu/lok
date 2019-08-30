package base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils.ReadExcel;

public class BaseUtils {
	public static ChromeDriver driver;
	public String excelFileName;
	@BeforeMethod
	@Parameters("url")
	public void login(String url) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}
	@AfterMethod
	public void closeApp() {
		driver.close();
	}

	@DataProvider(name="harika")
		public String[][] getData() throws IOException{
			return ReadExcel.getData(excelFileName);
		}
	@DataProvider(name="harika1")
	public String[][] getData1() throws IOException{
		return ReadExcel.getData(excelFileName);
	}
	@DataProvider(name="harika2")
	public String[][] getData2() throws IOException {
		return ReadExcel.getData(excelFileName);
	}
}




