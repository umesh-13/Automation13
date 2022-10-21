package scripts;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.AddtocartPage;
import pomPages.skillraryDemoLogin;
import pomPages.skillraryLoginPage;

public class Testcase1 extends BaseClass{
   
	@Test
	public void Tc1() throws InterruptedException
	{
		skillraryLoginPage s=new skillraryLoginPage(driver);
		Thread.sleep(2000);
		
		s.gearsbtn();
		s.demoapp();
	
		skillraryDemoLogin sd =new skillraryDemoLogin(driver);
		driverutilities.switchTabs(driver);
		driverutilities.mouseHover(driver,sd.getCoursetab());
		sd.seleniumtraining();
		
		AddtocartPage ad=new AddtocartPage(driver);
		driverutilities.doubleClick(driver,ad.getAddbtn());
		ad.getAddtocartbtn();
		
	}
	
	
}
