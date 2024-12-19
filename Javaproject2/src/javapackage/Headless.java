package javapackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Headless {
	WebDriver driver;
	WebDriverWait wait;

	public void setup() {
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--headless");
		//options.addArguments("--ignore-certificate-errors");
		driver = new ChromeDriver(options);
		driver.get("https://www.amazon.in/");
	}

	public void teardown() {
		driver.close();
	}

	public static void main(String[] args) {

		Headless test = new Headless();
		test.setup();
		test.teardown();

	}

}