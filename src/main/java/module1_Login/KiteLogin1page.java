package module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin1page
{
	@FindBy(xpath = "//input[@id='userid']") private WebElement UN;
	@FindBy(xpath = "//input[@id='password']") private WebElement PWD;
	@FindBy(xpath = "//button[text()='Login ']") private WebElement loginbtn;
	
	public KiteLogin1page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setUNkitelogin1page(String username)
	{
		UN.sendKeys(username);
	}
	
	public void setPWDkitelogin1page(String password)
	{
		PWD.sendKeys(password);
	}
	
	public void clickloginbtnkitelogin1page()
	{
		loginbtn.click();
	}

}
