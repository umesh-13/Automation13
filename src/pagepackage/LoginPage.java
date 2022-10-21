package pagepackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(name="username") private WebElement Username;
	@FindBy(name="pwd") private WebElement Password;
	@FindBy(id="loginButton") private WebElement Loginbutton;
	@FindBy(id="KeepLoggedInLabel") private WebElement Link;




	public LoginPage(WebElement driver) {
		PageFactory.initElements(driver,this);
	}
	

	public WebElement getUsername() {
		return Username;
	}
	public WebElement getPassword() {
		return Password;
	}
	public WebElement getLoginbutton() {
		return Loginbutton;
	}
	public WebElement getLink() {
		return Link;
	}
	
	
	
	public void validLogin()
	{
		Username.sendKeys("admin");
		Password.sendKeys("manager");
		Loginbutton.click();
	}
	
	public void InvalidLogin()
	{
		Username.sendKeys("admin12");
		Password.sendKeys("manager12");
		Loginbutton.click();
	}
	
	
	
	

}
