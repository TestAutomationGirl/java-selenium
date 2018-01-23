package pageObjects;

import org.openqa.selenium.By;

import StepDefinitions.BaseUtil;

public class homePage extends BaseUtil {

	BaseUtil base;

	public homePage(BaseUtil base) {
		super();
		this.base = base;
	}

	private static final By searchBox = By.id("twotabsearchtextbox");
	private static final By searchLookingGlass = By.className("nav-input");
	private static final By resultsFor = By.xpath("//a[@id='bcKwText']//span");

	public static void enterSearchTerms(String searchTerms) {
		driver.findElement(searchBox).clear();
		driver.findElement(searchBox).sendKeys(searchTerms);
	}

	public static void clickSearchLookingGlass() {
		driver.findElement(searchLookingGlass).click();
	}

	public static String getResultsText() {
		return driver.findElement(resultsFor).getText();
	}
}