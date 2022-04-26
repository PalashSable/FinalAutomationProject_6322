package lapcare;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Lapcare_YouTube_module
{
	//If we login account and run the script some time advertisement is presence many places thats why run the code without login
	WebDriver driver;
	@BeforeTest
	public void beforeTest() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\Admin\\Documents\\Automation Testing\\Browser Extension\\chromedriver.exe");
        driver= new ChromeDriver();
	    Thread.sleep(2000);
	    driver.manage().window().maximize();
	   
	    //URl
		 driver.get("https://www.lapcare.com/");
		 Thread.sleep(3000);
	 
		 //Advetise (This advertise is only for 30 April after that may be this code is not working properly bec this is live site.) 
		 driver.findElement(By.xpath(" /html/body/div[2]/div[3]")).click();		
	     Thread.sleep(2000);    
	     
		 //Clcik
//	     driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[3]/li")).click();		
//	     Thread.sleep(2000);            
//	     
//	     //SingUp
//	     driver.findElement(By.xpath("//*[@id=\"menu-list-grow\"]/li[2]/a/span")).click();	
//	     
//	     //Email Id
//		 driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/div[1]/div/input")).sendKeys("palashsable33@gmail.com");
//		 Thread.sleep(2000);          
//		 
//		 //Password
//		 driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/div[2]/div/input")).sendKeys("12345678");
//		 Thread.sleep(2000);
//		 
//		 //Click Button
//		 driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/button/span[1]")).click();
//		  Thread.sleep(3000);
	}
  @Test (priority=1)
  public void feedback() throws InterruptedException 
  {
	//How to scroll
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			Thread.sleep(4000);
//
//			 //Advetise (This advertise is only for 30 April after that may be this code is not working properly bec this is live site.) 
//			 driver.findElement(By.xpath("/html/body/div[2]/div[3]/div")).click();		
//		     Thread.sleep(2000);  
			
	//Feedback
	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/a[7]")).click();
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/form/div/div[1]/div/div/div/div/p/div/div/div[1]/div/div/input")).sendKeys("123456");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("plash sable");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/form/div/div[1]/div/div/div/div/p/div/div/div[3]/div/div/input")).sendKeys("hyundaimalegaon@gmail.com");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/form/div/div[1]/div/div/div/div/p/div/div/div[4]/div/div/input")).sendKeys("9923917099");
		 Thread.sleep(2000);
	  //Next Button
	  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/form/div/div[1]/div/div/div/div/div/div/button[2]")).click();
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/form/div/div[3]/div/div/div/div/p/div/div/div/div/fieldset[1]/div/label[2]/span[1]/span[1]/input")).click();
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/form/div/div[3]/div/div/div/div/p/div/div/div/div/fieldset[2]/div/label[2]/span[1]/span[1]/input")).click();
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/form/div/div[3]/div/div/div/div/p/div/div/div/div/fieldset[2]/div/label[2]/span[1]/span[1]/input")).click();
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/form/div/div[3]/div/div/div/div/p/div/div/div/div/fieldset[4]/div/label[2]/span[1]/span[1]/input")).click();
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/form/div/div[3]/div/div/div/div/p/div/div/div/div/fieldset[4]/div/label[2]/span[1]/span[1]/input")).click();
	  Thread.sleep(2000);
	  //Next
	  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/form/div/div[3]/div/div/div/div/div/div/button[2]")).click();
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//*[@id=\"message\"]")).sendKeys("This Site is to nice please improve some thing new and please stop all add some time its tricky");
	  Thread.sleep(2000);
	   
  }
@Test (priority=2)
public void Youtube() throws InterruptedException
{
	//How to scroll
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");//Scroll To Bottom
	Thread.sleep(2000);
	
	 //You-Tube
	  driver.findElement(By.xpath("//*[@id=\"__next\"]/div[3]/div/div[2]/div[3]/div[1]/a[5]")).click();
	  Thread.sleep(2000);
	  
	  //Videos
	  driver.findElement(By.xpath("//*[@id=\"tabsContent\"]/tp-yt-paper-tab[2]")).click();
	  Thread.sleep(2000);
	  //Happy Holi
	  driver.findElement(By.xpath("//*[@id=\"video-title\"]")).click();
	  Thread.sleep(2000);
	  
	  for (int i = 0; i <=5; i++)
	  {
	  //down
	  driver.findElement(By.xpath("//*[@id=\"navigation-button-down\"]/ytd-button-renderer")).click();
	  Thread.sleep(2000);
	  }
	  for (int i = 0; i <=3; i++)
	  {
//	  //Up
	  driver.findElement(By.xpath("//*[@id=\"navigation-button-up\"]/ytd-button-renderer/a")).click();
	  Thread.sleep(2000);
	  }

	//Home
	  driver.findElement(By.xpath("//*[@id=\"endpoint\"]/tp-yt-paper-item")).click();
	  Thread.sleep(3000);
	//Dot
	  driver.findElement(By.xpath("/html/body/ytd-app/div[1]/div/ytd-masthead/div[3]/div[3]/div[2]/ytd-topbar-menu-button-renderer[2]/div/a/yt-icon-button/button/yt-icon")).click();
	  Thread.sleep(3000);
	  //Theme
	  driver.findElement(By.xpath("/html/body/ytd-app/ytd-popup-container/tp-yt-iron-dropdown/div/ytd-multi-page-menu-renderer/div[3]/div[1]/yt-multi-page-menu-section-renderer[1]/div[2]/ytd-toggle-theme-compact-link-renderer")).click();
	   Thread.sleep(3000);
	//Dark Theme
	  driver.findElement(By.xpath("/html/body/ytd-app/ytd-popup-container/tp-yt-iron-dropdown/div/ytd-multi-page-menu-renderer/div[4]/ytd-multi-page-menu-renderer/div[3]/div[1]/yt-multi-page-menu-section-renderer/div[2]/ytd-compact-link-renderer[3]/a/tp-yt-paper-item")).click();
	  Thread.sleep(3000);
		//EduBridge
	  driver.findElement(By.xpath("/html/body/ytd-app/div[1]/div/ytd-masthead/div[3]/div[2]/ytd-searchbox/form/div[1]/div[1]/input")).sendKeys("EduBridge Girish Singhania");
	  Thread.sleep(3000);
	 // Search
	  driver.findElement(By.xpath("/html/body/ytd-app/div[1]/div/ytd-masthead/div[3]/div[2]/ytd-searchbox/button/yt-icon")).click();
	  Thread.sleep(3000);
		//play video
	  driver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer/div[3]/ytd-video-renderer[1]/div[1]/ytd-thumbnail/a/yt-img-shadow")).click();
	  Thread.sleep(3000);
}
  @AfterTest
  public void afterTest()
  {
	 driver.close();
	 
  }

}
