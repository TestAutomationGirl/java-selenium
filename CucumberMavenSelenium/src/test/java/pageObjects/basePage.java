package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class basePage {
    
    protected WebDriver driver;

    public basePage() {
    }
    
    public WebDriver getDefaultDriver() {
    	if (driver != null) {
			return driver;
		}
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\saduhx\\TestAutomation\\Ref\\packages\\Selenium.WebDriver.ChromeDriver.2.34.0\\driver\\win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
		return driver;
    }
    
    public void closeDriver() {
		if (driver != null) {
			driver.close();
			driver.quit(); 
			driver = null;
		}
	}
}