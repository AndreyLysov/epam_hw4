package pages;

import org.openqa.selenium.support.PageFactory;

import static driver.DriverFactory.getDriver;


public class BasePage {

	public BasePage() {
		PageFactory.initElements(getDriver(), this);
	}
}
