package reco;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Uploadcenter {
	
	WebDriver driver;
	WebDriverWait wait;
	

	public void loginsetup()
	{
		driver = new ChromeDriver();
		driver.get("http://13.203.6.58:9030/#/login");
		
	}
}
