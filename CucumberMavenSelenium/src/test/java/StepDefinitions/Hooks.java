package StepDefinitions;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseUtil {

	BaseUtil base;

	@Before
	public void testInitializer() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\saduhx\\TestAutomation\\Ref\\packages\\Selenium.WebDriver.ChromeDriver.2.34.0\\driver\\win32\\chromedriver.exe");
		base.setDriver(new ChromeDriver());
		driver.manage().window().maximize();
	}

	public Hooks(BaseUtil base) {
		this.base = base;
	}

	@After
	public void tearDownTest() {
		base.getDriver().close();
	}
}