package module1_Login_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class openflipkart
{
	@Test
	public void openapp() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","F:\\shubhamIT\\destiny\\programs\\Maven\\Browsers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://flipkart.com/");
		
		Thread.sleep(3000);
		
		driver.close();
	}
}
