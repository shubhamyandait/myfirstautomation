package module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin2page
{
	@FindBy(xpath = "//input[@id='pin']") private WebElement PIN;
	@FindBy(xpath = "//button[text()='Continue ']") private WebElement Ctnbtn;
	
	public KiteLogin2page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setPINkitelogin2page(String pin)
	{
		PIN.sendKeys(pin);
	}
	
	public void clickCtnbtnkitelogin2page()
	{
		Ctnbtn.click();
	}
}
