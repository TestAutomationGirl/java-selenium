package StepDefinitions;

import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.basePage;
import pageObjects.homePage;


public class AmazonSearchStep extends basePage{

	public homePage page;
	
	public AmazonSearchStep() {
		driver = getDefaultDriver();
		page = new homePage(driver);
	}
	
	@Given("^the user is on amazon homepage$")
	public void the_user_is_on_amazon_homepage(){		
		driver.get("https://www.amazon.com/");
		}

	@When("^the user searched for \"([^\"]*)\"$")
	public void the_user_searched_for(String searchTerm){
		page.enterSearchTerms(searchTerm);
		page.click();
	    }

	@Then("^the results are displayed for \"([^\"]*)\"$")
	public void the_results_are_displayed_for(String resultsTerm){
	    String results = page.getText();
	    String message = "Results did not match search term";
	    assertTrue(message, results.contains(resultsTerm));
	    closeDriver();
	}

}
