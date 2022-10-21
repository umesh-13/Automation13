package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.CoreJavaPage;
import pomPages.WishListPage;
import pomPages.skillraryLoginPage;

public class Testcase3 extends BaseClass{

	@Test
	public void Tc3() throws IOException, InterruptedException
	{
		skillraryLoginPage s=new skillraryLoginPage(driver);
		s.searchtextbox(pdata.getData("Search"));
		s.searchbtn();
		
		CoreJavaPage c=new CoreJavaPage(driver);
		c.corejavacourse();
		
		WishListPage w=new WishListPage(driver);
		w.closepopup();
		driverutilities.switchFrame(driver);
		
		Thread.sleep(2000);
		w.Playbutton();
		Thread.sleep(2000);
		w.Pausebutton();
		driverutilities.switchBack(driver);
		w.Addtowishlist();
		
		
		
		
		
		

		
	}

}
