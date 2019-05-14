package driver;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.openqa.selenium.Platform.LINUX;


public class DriverFactory {

	private static RemoteWebDriver driver;

	public static RemoteWebDriver getDriver() {
		if (driver == null) {
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setBrowserName(System.getProperty("browser"));
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
