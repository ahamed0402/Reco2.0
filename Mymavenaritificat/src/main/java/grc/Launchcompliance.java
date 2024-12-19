package grc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Launchcompliance {
	WebDriver driver ;
	ChromeOptions option;
	
	public void setup()
	{
		option.addArguments("Headless");
		driver= new ChromeDriver(option);
		driver.get("https://www.buyautoparts.com/");
		
	}
}