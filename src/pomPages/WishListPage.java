package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishListPage {
	
	@FindBy (xpath="//div[@class='play-icon']") private WebElement playbtn;
	@FindBy (xpath="//div[@class='pause-icon']") private WebElement pausebtn;
	@FindBy (xpath="//a[text()='X']") private WebElement popup;
	@FindBy (xpath="//span[.='Add To Wishlist']") private WebElement wishlistbtn;
	

	
	public WishListPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void closepopup()
	{
		popup.click();
	}
	
	public void Playbutton()
	{
		playbtn.click();
	}
	
	public void Pausebutton()
	{
		pausebtn.click();
	}
	
	public void Addtowishlist()
	{
		wishlistbtn.click();
	}
}
