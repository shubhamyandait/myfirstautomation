package module1_Login_Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LibraryFile.BaseClass;
import LibraryFile.UtilityClass;
import junit.framework.Assert;
import module1_Login.KiteHomepage;
import module1_Login.KiteLogin1page;
import module1_Login.KiteLogin2page;

public class KiteTest extends BaseClass
{
	KiteLogin1page login1;
	KiteLogin2page login2;
	KiteHomepage home;
	int TCID;
	
	@BeforeClass
	public void OpenBrowser() throws IOException
	{
		initializeBrowser();
		
		login1=new KiteLogin1page(driver);
		login2=new KiteLogin2page(driver);
		home=new KiteHomepage(driver);
	}
	
	@BeforeMethod
	public void loginToApp() throws IOException
	{
		login1.setUNkitelogin1page(UtilityClass.getPFData("UN"));
		login1.setPWDkitelogin1page(UtilityClass.getPFData("PWD"));
		login1.clickloginbtnkitelogin1page();
		login2.setPINkitelogin2page(UtilityClass.getPFData("PIN"));
		login2.clickCtnbtnkitelogin2page();
	}
	
	@Test
	public void verifyUserID() throws EncryptedDocumentException, IOException
	{
		TCID=103;
		String actUserID =home.getuserIDkitehomepage();
		String expUserID =UtilityClass.getTestData(1,4);
		
		Assert.assertEquals(expUserID,actUserID);
	}
	
	@AfterMethod
	public void ScreenShot(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			UtilityClass.capturescreenshot(driver, TCID);
		}
	}
	
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
}
