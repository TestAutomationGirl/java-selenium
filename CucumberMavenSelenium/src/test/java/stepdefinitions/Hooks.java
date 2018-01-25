package stepdefinitions;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import pageObjects.BaseUtil;

public class Hooks extends BaseUtil {

	BaseUtil base;

	@Before
	public void testInitializer() {
		String driverPath = System.getProperty("user.dir");
		System.out.println(driverPath);
		System.setProperty("webdriver.chrome.driver",
				driverPath + "//chromedriver.exe");
		
		base.setDriver(new ChromeDriver());
		driver.manage().window().maximize();
	}

	public Hooks(BaseUtil base) {
		this.base = base;
	}

	@After
	public void tearDownTest() {
		base.getDriver().close();
		base.getDriver().quit();
	}
}