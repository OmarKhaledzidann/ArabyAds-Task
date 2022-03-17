package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;

public class TestBase {
	public static WebDriver driver;
	protected ExtentReports report;

	@BeforeSuite
	public void startDrvier() throws Exception {
		report = new ExtentReports(System.getProperty("user.dir") + "/ExtentReportResults.html");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.navigate().to("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

	}

	@AfterSuite
	public void closeDriver() {
		driver.quit();
		report.flush();
	}
}
