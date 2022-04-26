package lapcare;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;




public class DataDriven_Lapcare
{
	WebDriver driver;
	@BeforeTest
	public void beforeTest() throws InterruptedException
	{
//		System.setProperty("webdriver.chrome.driver", "D:\\Users\\Admin\\Documents\\Automation Testing\\Browser Extension\\chromedriver.exe");
//        driver= new ChromeDriver();
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Documents\\Automation Testing\\Browser Extension\\geckodriver.exe");
		driver=new FirefoxDriver();
		Thread.sleep(2000);
	   driver.manage().window().maximize();
	}
 
  @Test(dataProvider = "dp")
  public void DataDriven_Lapcare (String username, String password) throws InterruptedException 
  {
	  Lapcare_POM  o=new Lapcare_POM ();
	 
	  o.url(driver);
 	 o.EMail(driver, username);
 	 o.passWord(driver, password);
 	 o.SigninButton(driver);
 	Thread.sleep(1000);
 	o.HometButton(driver);
 	Thread.sleep(1000);
 	o.HometButto(driver);
 	Thread.sleep(1000);
 	 o.MyAccountButtonn(driver);
 	 Thread.sleep(1000);	
 
 	 o.SignOutButton(driver);
 	// o.closebrowser(driver);
  }
@DataProvider
public Object[][] dp() 
{
  return new Object[][] 
{
	  new Object[] { "palashsable33@gmail.com", "12345678" },
    new Object[] { "demo", "admin1" },
    new Object[] { "palashsable33@gmail.com", "plash" },
    new Object[] { "Deep", "plash" },
    
    
  };
}
}
