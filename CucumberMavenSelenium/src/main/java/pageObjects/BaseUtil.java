package pageObjects;

import org.openqa.selenium.WebDriver;

public class BaseUtil {

	protected static WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		BaseUtil.driver = driver;
	}
}