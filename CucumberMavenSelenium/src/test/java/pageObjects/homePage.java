package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePage extends basePage{
    public homePage(WebDriver driver) {
		super();
		this.driver = driver;
	}
    
    private static final By searchBox = By.id("twotabsearchtextbox");
    private static final By searchLookingGlass = By.className("nav-input");
    private static final By resultsFor = By.xpath("//a[@id='bcKwText']//span");
    
    public void enterSearchTerms(String searchTerms)
    {
    	driver.findElement(searchBox).clear();
    	driver.findElement(searchBox).sendKeys(searchTerms);
    }
    
    public void click()
    {
    	driver.findElement(searchLookingGlass).click();
    }
    
    public String getText()
    {
    	return driver.findElement(resultsFor).getText();
    }
}