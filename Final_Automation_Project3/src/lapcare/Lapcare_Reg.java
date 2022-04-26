package lapcare;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Lapcare_Reg
{
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
		 //Advetise
		 driver.findElement(By.xpath(" /html/body/div[2]/div[3]")).click();		
	     Thread.sleep(2000);     
		 //Clcik
	     driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[3]/li")).click();		
	     Thread.sleep(2000);            
	     
	     //SingUp
	     driver.findElement(By.xpath("//*[@id=\"menu-list-grow\"]/li[2]/a/span")).click();	
	     
	}
  @Test
  public void Reg() throws InterruptedException
  {
	  //Cretate Button
	  driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[1]/p/span")).click();
	  Thread.sleep(2000);
	//First Name		 
    driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/div[1]/div/input")).sendKeys("palash");
	 Thread.sleep(2000);
	 
	 //Last Name
	 driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/div[2]/div/input")).sendKeys("Sable");
	 Thread.sleep(2000);
	 
	 //Email
	 driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/div[3]/div/input")).sendKeys("hyundaimalegaon@gmail.com");
	 Thread.sleep(2000);
	 
	 //Contact 
	 driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/div[4]/div/input")).sendKeys("7385166463");
	  Thread.sleep(2000);
	  
	 //Password
	 driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/div[5]/div/input")).sendKeys("12345678");
	 Thread.sleep(2000);
	 
	//Register Button
   driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/button/span[1]")).click();		
	  
  }

  @AfterTest
  public void afterTest()
  {
	  driver.close();
  }

}
