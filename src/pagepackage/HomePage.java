package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	
	@FindBy(xpath="//div[.='Time-Track']") private WebElement TimeTrack;
	@FindBy(xpath="//div[.='Tasks']") private WebElement Task;
	@FindBy(xpath="//div[.='Report']") private WebElement Reports;
	@FindBy(xpath="//div[.='Users']") private WebElement Users;
	@FindBy(xpath="//div[.='WorkSchedule']") private WebElement workSchedule;
	@FindBy(xpath="//div[.='Settings']") private WebElement Settings;
	
	
	public HomePage(WebDriver driver) {
	PageFactory.initElements(driver,this);	
	}
	
	
	
	
	public WebElement getTimeTrack() {
		return TimeTrack;
	}
	public WebElement getTask() {
		return Task;
	}
	public WebElement getReports() {
		return Reports;
	}
	public WebElement getUsers() {
		return Users;
	}
	public WebElement getWorkSchedule() {
		return workSchedule;
	}
	public WebElement getSettings() {
		return Settings;
	}
	
	
	public void clickOnSettings()
	{
		Settings.click();
	}
	
	public void clickOnUsers()
	{
		Users.click();
	}
}
