package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class skillraryLoginPage {

	@FindBy(xpath="//a[text()=' GEARS ']") private WebElement gearsbtn;
	
	@FindBy (xpath="(//a[text()=' SkillRary Demo APP'])[2]") private WebElement demoapp;
	
	@FindBy (name="q") private WebElement searchtb;
	
	@FindBy (xpath="//input[@value='go']") private WebElement searchbtn;
	
	public skillraryLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getGearsbtn() {
		return gearsbtn;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}

	public WebElement getSearchtb() {
		return searchtb;
	}

	public WebElement getDemoapp() {
		return demoapp;
	}

	public void gearsbtn()
	{
		gearsbtn.click();
	}
	
	public void demoapp()
	{
		demoapp.click();
	}
	
	public void searchtextbox()
	{
		searchtb.click();
	}
	
	public void searchtextbox(String Search)
	{
		searchtb.sendKeys(Search);
	}
	
	public void searchbtn()
	{
		searchbtn.click();
	}
	

}
