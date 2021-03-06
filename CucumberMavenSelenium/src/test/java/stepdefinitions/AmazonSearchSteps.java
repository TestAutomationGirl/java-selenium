package stepdefinitions;

import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.homePage;
import pageObjects.BaseUtil;

public class AmazonSearchSteps extends BaseUtil {

	private homePage page;

	public AmazonSearchSteps() {
		page = new homePage();
	}

	@Given("^the user is on the Amazon home page$")
	public void the_user_is_on_the_Amazon_home_page() {
		driver.get("https://www.amazon.com/");
	}

	@When("^the user searched for \"([^\"]*)\"$")
	public void the_user_searched_for(String searchTerm) {
		page.enterSearchTerms(searchTerm);
		page.clickSearchLookingGlass();
	}

	@Then("^the results are displayed for \"([^\"]*)\"$")
	public void the_results_are_displayed_for(String resultsTerm) {
		String results = page.getResultsText();
		String message = "Results did not match the search term";
		assertTrue(message, results.contains(resultsTerm));
	}

	@Given("^the user selects the department \"([^\"]*)\" from search drop down menu$")
	public void the_user_selects_the_department_from_search_drop_down_menu(String option) {
		page.SelectSearchDropDownMenu(option);
	}

	@Then("^the results header contains department \"([^\"]*)\"$")
	public void the_results_header_contains_department(String resultsHeader) {
		String results = page.getResultsHeaderText();
		String message = "Results header did not contain the selected department";
		assertTrue(message, results.contains(resultsHeader));
	}
}