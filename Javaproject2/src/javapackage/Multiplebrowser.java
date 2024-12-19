package javapackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multiplebrowser {

	WebDriver driver;

	@BeforeClass
	@Parameters("browser")
	public void crossbrowser(String browser) throws Exception {
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}

		else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}

		else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}

		else {
			throw new Exception("Incorrect browser");
		}
	}

	@Test
	public void launch() {
		driver.get("https://www.amazon.in/");

	}

	@AfterClass
	public void teardown() {
		//driver.quit();
	}
}
