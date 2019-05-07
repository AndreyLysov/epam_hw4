package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class GoogleHomePage extends BasePage {
	@FindBy(name = "q")
	private WebElement searchInput;

	public void searchFor(String text) {
		searchInput.sendKeys(text + Keys.ENTER);
	}
}