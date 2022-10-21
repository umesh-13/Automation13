package generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IAutoConstant {


	static WebDriver driver;

	public void openBrowser() throws IOException
	{
		Filelib filelib = new Filelib();
		String browser = filelib.readDataFromPropfile(PROP_PATH,"Browser");
		String url = filelib.readDataFromPropfile(PROP_PATH,"Url");

		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty(CHROME_KEY,CHROME_VALUE);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(url);

		}

		else if(browser.equalsIgnoreCase("Firefox"))
		{
			System.setProperty(GECKO_KEY,GECKO_VALUE);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(url);

		}


	}               	
	public void closeBrowser()
	{
		driver.quit();
	}

}

