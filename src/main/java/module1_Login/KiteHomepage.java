package module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomepage
{
	@FindBy(xpath = "//span[@class='user-id']") private WebElement UserID;
	
	public KiteHomepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getuserIDkitehomepage()
	{
		String actUserID = UserID.getText();
		return actUserID;
	}
}
