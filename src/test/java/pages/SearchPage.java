package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;


public class SearchPage extends BasePage {
	@FindBys(@FindBy(xpath = "//h3"))
	private List<WebElement> searchResults;

	public boolean searchResultIsPresent() {
		getWait().until(ExpectedConditions.visibilityOf(searchResults.get(0)));
		return searchResults.isEmpty();
	}
}
