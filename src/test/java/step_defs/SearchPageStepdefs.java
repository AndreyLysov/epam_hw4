package step_defs;

import cucumber.api.java.en.Then;
import pages.SearchPage;

import static org.junit.Assert.assertFalse;


public class SearchPageStepdefs extends SearchPage {

	@Then("^Search result is displayed$")
	public void search_result_is_displayed() {
		assertFalse("Search results are not displayed",
					searchResultIsPresent());
	}
}
