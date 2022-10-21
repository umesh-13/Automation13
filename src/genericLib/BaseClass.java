package genericLib;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public  WebDriver driver;
	public PropertyFileData pdata =new PropertyFileData();
	public WebDriverUtilities driverutilities=new WebDriverUtilities();
	@BeforeMethod

	public void openApp() throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pdata.getData("Url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}

	@AfterMethod
	public void CloseApp()
	{
		driver.quit();
	}

}
