package step_defs;

import cucumber.api.java.en.When;
import pages.GoogleHomePage;


public class HomePageStepdefs extends GoogleHomePage {

	@When("^Search for \"([^\"]*)\"$")
	public void search_for(String text) {
		searchFor(text);
	}
}
