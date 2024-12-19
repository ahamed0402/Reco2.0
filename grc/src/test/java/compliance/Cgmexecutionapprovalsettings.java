package compliance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Cgmexecutionapprovalsettings {

	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-infobars");
		driver = new ChromeDriver(option);

		driver.get("http://13.203.6.58:7000/#/login");
		driver.manage().window().maximize();

		Cgmbaseclass cgm = new Cgmbaseclass(driver);
		Cgmapprovalsettings cgmapp = new Cgmapprovalsettings(driver);

		cgm.enterUsername("qc.test52@aparajitha.net");
		cgm.enterPassword("Acsl@123");
		cgm.groupname("wal");
		cgm.clickSignIn();
		cgm.clickLegal();
		cgm.clickSelect();


Thread.sleep(3000);
		cgmapp.general();
		cgmapp.approvalsettings();
		cgmapp.addnew();
		cgmapp.unitradio();
		cgmapp.unitdrop();
		cgmapp.unitselect();
		cgmapp.module();
		cgmapp.moduleselect();
		cgmapp.type();
		cgmapp.typeapprovalselect();
		cgmapp.approvals();

	}

}
