package driver;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.*;
import static org.openqa.selenium.Platform.*;
import static org.openqa.selenium.remote.BrowserType.*;


public class DriverFactory {

	private static RemoteWebDriver driver;

	public static RemoteWebDriver getDriver() {
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setBrowserName(FIREFOX);
			caps.setPlatform(LINUX);
			caps.setVersion("57.0");
			caps.setCapability("enableVNC", true);
			caps.setCapability("enableVideo",true);
			caps.setCapability("enableLog",true);
			URL url;
			try {
				url = new URL("http://10.0.2.10:4444/wd/hub");
				driver = new RemoteWebDriver(url, caps);
			}
			catch (MalformedURLException e) {
				e.printStackTrace();
			}
			driver.manage().timeouts().implicitlyWait(10, SECONDS);
			driver.get("https://www.google.com");
			return driver;
		}
		else
			return driver;
	}
}
