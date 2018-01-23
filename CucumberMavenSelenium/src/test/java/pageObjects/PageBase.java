package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public abstract class PageBase {

    protected WebDriver driver;

    public PageBase(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Get the page title
     *
     * @return String
     */
    public String getTitle() {
        return driver.getTitle();
    }

    /**
     * Clicks at the current mouse location
     *
     * @param query
     */
    public void click(By query) {
        driver.findElement(query).click();
    }

    /**
     * @param query
     */
    public void clear(By query) {
        driver.findElement(query).clear();
    }

    /**
     * Sends keys to the active element
     *
     * @param query
     * @param value
     */
    public void sendKeys(By query, String value) {
        driver.findElement(query).sendKeys(value);
    }

    /**
     * If this current element is a form, or an element within a form, then this will be submitted to the remote server
     *
     * @param query
     */
    public void submit(By query) {
        driver.findElement(query).submit();
    }

    /**
     * Get the visible (i.e. not hidden by CSS) innerText of this element,
     * including sub-elements, without any leading or trailing whitespace.
     *
     * @param query
     * @return String
     */
    public String getText(By query) {

        return driver.findElement(query).getText();
    }

    /**
     * Get the tag name of this element
     *
     * @param query
     * @return String
     */
    public String getTageName(By query) {
        return driver.findElement(query).getTagName();
    }

    /**
     * Select all options that display text matching the argument
     *
     * @param query
     * @param value
     */
    public void selectByVisibleText(By query, String value) {
        Select sortList = new Select(driver.findElement(query));
        sortList.selectByVisibleText(value);
    }

    /**
     * Determine whether or not the element is displayed
     *
     * @param query
     * @return boolean
     */
    public boolean isDisplayed(By query) {
        return driver.findElement(query).isDisplayed();
    }

    /**
     * Determine whether or not this element is enabled or not
     *
     * @param query
     * @return boolean
     */
    public boolean isEnabled(By query) {
        return driver.findElement(query).isEnabled();
    }

    /**
     * Determine whether or not this element is selected or not. This operation only applies to input elements
     * such as checkboxes, options in a select and radio buttons
     *
     * @param query
     * @return boolean
     */
    public boolean isSelected(By query) {
        return driver.findElement(query).isSelected();
    }

}


/*package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class basePage {
    
    protected static WebDriver driver;

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
}*/