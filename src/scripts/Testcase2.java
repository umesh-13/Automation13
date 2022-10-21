package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.CoursePage;
import pomPages.skillraryDemoLogin;
import pomPages.skillraryLoginPage;

public class Testcase2 extends BaseClass{

	@Test
	public void Tc2() throws IOException
	{
		skillraryLoginPage s=new skillraryLoginPage(driver);
		s.gearsbtn();
		s.demoapp();
		
		skillraryDemoLogin sd=new skillraryDemoLogin(driver);
		driverutilities.switchTabs(driver);
		driverutilities.dropdown(sd.getCoursedd(),pdata.getData("Coursedd"));
		
		CoursePage cp=new CoursePage(driver);
		driverutilities.draganddrop(driver,cp.getSeleniumcourse(),cp.getCartarea());
		WebElement loc = cp.getFacebookbtn();
		Point l = loc.getLocation();
		int x=l.getX();
		int y=l.getY();
		
		driverutilities.scrollBar(driver,x,y);
		cp.facebookbtn();
		
			
		
	}
}
