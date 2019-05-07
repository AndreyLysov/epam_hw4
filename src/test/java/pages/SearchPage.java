package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static driver.DriverFactory.getDriver;
import static org.junit.Assert.assertFalse;


public class SearchPage extends BasePage {
	@FindBys(@FindBy(xpath = "//h3"))
	private List<WebElement> searchResults;

	public boolean searchResultIsPresent() {
		return searchResults.isEmpty();
	}
}
