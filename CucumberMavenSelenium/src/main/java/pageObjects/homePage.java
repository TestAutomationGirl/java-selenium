package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import java.util.concurrent.TimeUnit;

public class homePage extends BaseUtil {

	public homePage() {
	}

	FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS)
			.pollingEvery(2, TimeUnit.SECONDS).ignoring(NoSuchElementException.class)
			.ignoring(StaleElementReferenceException.class);

	private WebElement searchBox() {
		return driver.findElement(By.id("twotabsearchtextbox"));
	}

	private WebElement searchLookingGlass() {
		return driver.findElement(By.className("nav-input"));
	}

	private WebElement resultsFor() {
		return driver.findElement(By.xpath("//a[@id='bcKwText']//span"));
	}
	
	private WebElement SearchDropDownMenu()
	{
		return driver.findElement(By.id("searchDropdownBox"));
	}

	private WebElement SearchDropDownMenuOptions(String option)
	{
		return driver.findElement(By.xpath("//option[contains(text(),'" + option + "')]"));
	}
	
	private WebElement resultsHeader()
	{
		return driver.findElement(By.xpath("//span[@id='s-result-count']/span/a"));
	}
	
	public void SelectSearchDropDownMenu(String option)
	{
		SearchDropDownMenu().click();
		SearchDropDownMenuOptions(option).click();
	}
	
	public void enterSearchTerms(String searchTerms) {
		wait.until(ExpectedConditions.visibilityOf(searchBox()));
		searchBox().clear();
		searchBox().sendKeys(searchTerms);
	}

	public void clickSearchLookingGlass() {
		wait.until(ExpectedConditions.elementToBeClickable(searchLookingGlass()));
		searchLookingGlass().click();
	}

	public String getResultsText() {
		wait.until(ExpectedConditions.visibilityOf(resultsFor()));
		return resultsFor().getText();
	}
	
	public String getResultsHeaderText()
	{
		wait.until(ExpectedConditions.visibilityOf(resultsHeader()));
		return resultsHeader().getText();
	}
}