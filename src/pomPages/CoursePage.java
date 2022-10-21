package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoursePage {
   
	@FindBy (id="Selenium Training") private WebElement seleniumcourse;
	
	@FindBy (id="cartArea") private WebElement cartarea;
	
	@FindBy (xpath="(//i[@class='fa fa-facebook'])[2]") private WebElement facebookbtn;
	
	public CoursePage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getSeleniumcourse() {
		return seleniumcourse;
	}

	public WebElement getCartarea() {
		return cartarea;
	}

	public WebElement getFacebookbtn() {
		return facebookbtn;
	}
	
	public void facebookbtn()
	{
		facebookbtn.click();
	}
	
}
