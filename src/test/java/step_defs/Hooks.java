package step_defs;

import cucumber.api.java.After;

import static driver.DriverFactory.getDriver;


public class Hooks {
	@After
	public void tearDown() {
		getDriver().close();
	}
}
