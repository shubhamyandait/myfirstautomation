package module1_Login_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class sample1
{
		@Test
		public void openAmazon() throws Exception
		{
			System.setProperty("webdriver.gecko.driver","F:\\shubhamIT\\destiny\\programs\\Maven\\Browsers\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			
			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("https://Amazon.com/");
			
			Thread.sleep(3000);
			
			driver.close();
		}
	
}
