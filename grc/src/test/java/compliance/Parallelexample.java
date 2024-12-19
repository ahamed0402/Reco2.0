package compliance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallelexample {

	WebDriver driver;
	WebDriverWait wait;

	@Test
	@Parameters("browser")
	public void login(String browser) {
		
		browser = browser.trim().toLowerCase();
		
		
		switch (browser) {
		case "chrome":
			driver = new ChromeDriver();
			break;

		case "firefox":
			driver = new FirefoxDriver();
			break;

		case "edge":
			driver = new EdgeDriver();
			break;
			
		default:
            throw new IllegalArgumentException("Invalid browser name: " + browser);


		}

		driver.get("http://13.203.6.58:9030/#/login");
		driver.quit();
	}

}
