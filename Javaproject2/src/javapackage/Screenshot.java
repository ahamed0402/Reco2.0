package javapackage;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Screenshot {

	
	static WebDriver driver;
	WebDriverWait wait;
	
	public void launch()
	{
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}

	public static void main(String[] args) throws IOException {
		
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		File destination = new File ("screenshot.png");
		
		FileUtils.copyFile(screenshot, destination);
		
		
		
		
		

	}

}
