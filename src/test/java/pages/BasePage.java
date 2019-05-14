package pages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static driver.DriverFactory.getDriver;


public class BasePage {

	private WebDriverWait wait = new WebDriverWait(getDriver(), 10);
	public BasePage() {
		PageFactory.initElements(getDriver(), this);
	}

	public WebDriverWait getWait() {
		return wait;
	}
}
