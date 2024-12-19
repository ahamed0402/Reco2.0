package javapackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

public class Templateuploadclass {
    
	
	
    @BeforeClass
	public static void main (String[] args) throws AWTException
	{
    	
    	
    	WebDriver driver;
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-infobars");
		driver = new ChromeDriver(option);
		//driver = new FirefoxDriver();
		driver.get("http://52.66.68.173:9030/#/login");
		driver.manage().window().maximize();
	
    Baseclass bl = new Baseclass(driver);
    Loginpage lp = new Loginpage(driver);
    


	bl.enterUsername("qc.test52@aparajitha.net");
	bl.enterPassword("Acsl@123");
	bl.groupname("wal");
	bl.clickSignIn();
	bl.clickLegal();
	bl.clickSelect();
	
	
	lp.clickInputetemplate();
	lp.clickAddNew();
	lp.selectUnit();
	lp.selectUnitOption("Compliance Focused D");
	lp.selectPaygroup();
	lp.selectPaygroupOption("Executive");
	lp.selectMonthDropDown();
	lp.selectMonthOption("April");
	lp.selectYearDropdown();
	lp.selectYearOption("2024");
	lp.selectTemplate("Employee Master");
	lp.clickBrowseFile();
	

    // File Upload Simulation
    Robot robot = new Robot();
    robot.setAutoDelay(2000);

    // Copy the file path to clipboard
    String filePath = "X:\\Team\\Ahamed.I\\Employee Master_Template_04092024_104439.xlsx";
    java.awt.datatransfer.StringSelection stringSelection = new java.awt.datatransfer.StringSelection(filePath);
    java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

    // Simulate Ctrl+V to paste the file path
    robot.keyPress(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_CONTROL);

    // Simulate Enter key to confirm
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);


    
    lp.clickUpload();
    
	}
}