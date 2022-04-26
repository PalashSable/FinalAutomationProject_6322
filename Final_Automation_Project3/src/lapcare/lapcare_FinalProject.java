package lapcare;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class lapcare_FinalProject 
{
	
	//Once you run this project by using automation and if you want run second time please remove the cart item manually as well as address
	//This is live site some time some new advertise is presence in some pages that time code is not working as par priority
	//Advertise (This advertise is only for 30 April after that may be this code is not working properly because this is live site.)
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
	     driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[3]/li")).click();		
	     Thread.sleep(2000);            
	     
	     //SingUp
	     driver.findElement(By.xpath("//*[@id=\"menu-list-grow\"]/li[2]/a/span")).click();	
	     
	     //Email Id
		 driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/div[1]/div/input")).sendKeys("palashsable33@gmail.com");
		 Thread.sleep(2000);          
		 
		 //Password
		 driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/div[2]/div/input")).sendKeys("12345678");
		 Thread.sleep(2000);
		 
		 //Click Button
		 driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/button/span[1]")).click();
		  Thread.sleep(3000);
	}

  @Test (priority = 1)
  public void SmokeTesting() throws InterruptedException
 {
  
	//step:1 Create Object Of Actions class
			Actions a= new Actions(driver);
			 Thread.sleep(2000);
			//Step :2 Create Object of list with Webelment
			List<WebElement> ls=driver.findElements(By.xpath("//*[@id=\"__next\"]/header/div/div[2]/li"));
			 Thread.sleep(2000);                                             
			//Step:3 Store Size of List
			int listSize=ls.size();
			System.out.println("No Of Modules:"+listSize);
			 Thread.sleep(1000);
			//Step:4 Foor loop
			for(int i=1; i<=listSize; i++)
			{
				//Wait
				Thread.sleep(1000);
				//Display Module'Name
				System.out.println(driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[2]/li["+i+"]")).getText());
				 Thread.sleep(1000);
				//Performance Mouse Hover
				a.moveToElement(driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[2]/li["+i+"]"))).click().perform();
			}
  }

	 @Test   (priority = 2)
	  public void Module1() throws IOException, InterruptedException
	 {
	  //Item 2
		  driver.findElement(By.xpath("//*[@id=\"scrollable-auto-tabpanel-0\"]/div/div/div/div/div[2]/div/div[4]")).click();
		  Thread.sleep(3000);
		  //Scroll Image
		  driver.findElement(By.xpath(" /html/body/div[1]/div[2]/div[2]/div/div[1]/div/div/div[3]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath(" /html/body/div[1]/div[2]/div[2]/div/div[1]/div/div/div[3]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath(" /html/body/div[1]/div[2]/div[2]/div/div[1]/div/div/div[3]")).click();	
		  Thread.sleep(1000);
		  driver.findElement(By.xpath(" /html/body/div[1]/div[2]/div[2]/div/div[1]/div/div/div[3]")).click();	
		  Thread.sleep(1000);
	      //Pincode
		  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div[2]/div/div[3]/div/div[1]/div/div[2]/form/div/div/input")).sendKeys("423203");
		  Thread.sleep(1000);		  
          //Check
		  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div[2]/div/div[3]/div/div[1]/div/div[2]/form/button/span[1]")).click();
		  //Add Item
		  driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div/div[2]/div/div[2]/button[1]")).click();
		  Thread.sleep(3000);
		  //Add Cart
		  driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[3]/button")).click();
		  Thread.sleep(2000);
	     
  }
         @Test   (priority = 3)
        public void Module2() throws InterruptedException
 {
	    Thread.sleep(2000);
	   //Antivirus
	    driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[2]/li[5]")).click();
	    Thread.sleep(2000);
	    //lapcare av
	    driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[2]/div/div/div/div/div/div[1]/div/a/span")).click();
	   Thread.sleep(2000);                               
	   //add to cart
	   driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div[1]/div[2]/div[2]/button[1]")).click();
	   Thread.sleep(3000);
 }
      @Test  (priority = 4)
      public void Module3() throws InterruptedException
 {
	
	  //power solution
	  driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[2]/li[6]")).click();
	  Thread.sleep(2000);
	 //Laptop Battery
	  driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[2]/div/div/div/div/div/div[1]/div/a/span")).click();
	  Thread.sleep(2000);
	  //filter
	  driver.findElement(By.xpath("//*[@id=\"sort\"]")).click();
	  Thread.sleep(2000);
	  //low to high
	  driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[1]")).click();
	  Thread.sleep(2000);
	  //product
	  driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div[2]/div[3]/div[1]/div/div[2]/p[1]")).click();
	  Thread.sleep(2000);
	 // Scroll Image
       driver.findElement(By.xpath(" /html/body/div[1]/div[2]/div[2]/div/div[1]/div/div/div[3]")).click();
      Thread.sleep(1000);
	  driver.findElement(By.xpath(" /html/body/div[1]/div[2]/div[2]/div/div[1]/div/div/div[3]")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath(" /html/body/div[1]/div[2]/div[2]/div/div[1]/div/div/div[3]")).click();	
	  Thread.sleep(1000);
     driver.findElement(By.xpath(" /html/body/div[1]/div[2]/div[2]/div/div[1]/div/div/div[3]")).click();	
	  Thread.sleep(1000);
     //Pincode
	  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div[2]/div/div[3]/div/div[1]/div/div[2]/form/div/div/input")).sendKeys("423203");
      Thread.sleep(1000);
	  //Check pincode
	  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div[2]/div/div[3]/div/div[1]/div/div[2]/form/button/span[1]")).click();
	  //add cart button
	  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div[2]/div/div[2]/button[1]/span[1]")).click();
	  Thread.sleep(2000);
	    
 }
     @Test  (priority = 5)
     public void Module4() throws InterruptedException
 {
	 Thread.sleep(2000);
	 //Scroll  down
 	 JavascriptExecutor js=(JavascriptExecutor)driver;
     js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	 Thread.sleep(2000);	
     //service center
      driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/a[5]/p")).click();
     Thread.sleep(2000);
  
}
 
     @Test  (priority = 6)
     public void AudioModule() throws InterruptedException, IOException
 {
	
	//Click Audio Module
     driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[2]/li[2]/span")).click();
    Thread.sleep(2000);
    //Headset
     driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div/div/div/div/div/div[1]/div/a/span")).click();
    Thread.sleep(2000);
   
    // Screenshort
 	TakesScreenshot ts=(TakesScreenshot)driver;
 	File src=ts.getScreenshotAs(OutputType.FILE);
 	FileHandler.copy(src,new File(".\\lapcare_FinalProject_Audio.png"));
 	Thread.sleep(2000);
   
 }
 
    @Test (priority = 7)
    public void pheripheralModule() throws InterruptedException, IOException
{

    //pheripheral
    driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[2]/li[3]")).click();
    Thread.sleep(2000);
    //CCTV PowerSupply
    driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[2]/div/div/div/div/div/div[5]/div/a/span")).click();
    Thread.sleep(2000);
   // Screenshort
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src,new File(".\\lapcare_FinalProject_CCTV.png"));
	Thread.sleep(2000);
 
 }
 
    @Test (priority = 8)
    public void AssesoriesModule() throws InterruptedException, IOException
 {
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[2]/li[4]")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[2]/div/div/div/div/div/div[3]/div/a")).click();
	   Thread.sleep(2000);
	 // Screenshort
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File(".\\lapcare_FinalProject_LapiStandpng"));
		Thread.sleep(2000);
 }
 
 
 
    @Test   (priority = 9)
    public void Module5() throws InterruptedException
 {
	  Thread.sleep(2000);
	  //Search Box
     driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[3]/span")).click();
     Thread.sleep(2000);
     //Search Item
     driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[3]/div/div/div/form/div/div/input")).sendKeys("Laptop");
     Thread.sleep(2000);
     //Search Button
     driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[3]/div/div/div/form/div/button[2]")).click();
     Thread.sleep(2000);
     //Item
     driver.findElement(By.xpath("//*[@id=\"__next\"]/div[3]/div/div/div[2]/div[1]/div/div[2]/button/span[1]")).click();
     Thread.sleep(2000);
     //Product
     driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/div[1]/div/div[2]/p[1]")).click();
     Thread.sleep(2000);
     //Scroll Image
     driver.findElement(By.xpath(" /html/body/div[1]/div[2]/div[2]/div/div[1]/div/div/div[3]")).click();
     Thread.sleep(1000);
      driver.findElement(By.xpath(" /html/body/div[1]/div[2]/div[2]/div/div[1]/div/div/div[3]")).click();
      Thread.sleep(1000);
      driver.findElement(By.xpath(" /html/body/div[1]/div[2]/div[2]/div/div[1]/div/div/div[3]")).click();	
      Thread.sleep(1000);
      driver.findElement(By.xpath(" /html/body/div[1]/div[2]/div[2]/div/div[1]/div/div/div[3]")).click();	
      Thread.sleep(1000);
     //Pincode
      driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div[2]/div/div[3]/div/div[1]/div/div[2]/form/div/div/input")).sendKeys("423203");
     Thread.sleep(1000);
     //Check pincode
     driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div[2]/div/div[3]/div/div[1]/div/div[2]/form/button/span[1]")).click();
     //Add to cart
      driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div[2]/div/div[2]/button[1]/span[1]")).click();
      Thread.sleep(2000);
	   // Add to cart
	   driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[3]/button")).click();
	   Thread.sleep(2000);
	   //CheckOut
	   driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div/div/div[1]/button/span[1]")).click();
 	  Thread.sleep(2000);
	  //Name
	  driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div[2]/form/div/div[1]/div[3]/div[1]/div[1]/div/input")).sendKeys("Palash Sable");
      Thread.sleep(2000);
     	//Address Line 1
	  driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div[2]/form/div/div[1]/div[3]/div[1]/div[2]/div/input")).sendKeys("Malegaon");
	  Thread.sleep(2000);
	  //Address Line 2
	  driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div[2]/form/div/div[1]/div[3]/div[1]/div[3]/div/input")).sendKeys("Nashik");
	  Thread.sleep(2000);
	  //Landmark
	  driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div[2]/form/div/div[1]/div[3]/div[1]/div[4]/div/input")).sendKeys("Camp");
	  Thread.sleep(2000);
	  //City
	  driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div[2]/form/div/div[1]/div[3]/div[1]/div[5]/div/input")).sendKeys("Malegaon");
	  Thread.sleep(2000);
	  //Pin Code
	  driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div[2]/form/div/div[1]/div[3]/div[1]/div[7]/div/input")).sendKeys("423203");
	  Thread.sleep(2000);
	  //Phone No
	  driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div[2]/form/div/div[1]/div[3]/div[1]/div[8]/div/input")).sendKeys("8788243496");
	  Thread.sleep(2000);
	  //Check Box
	  //  driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div[2]/form/div/div[1]/div[3]/div[2]/label/span[1]/span[1]/input")).click();
     //Payment Button
	  driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div[2]/form/div/div[2]/div/button/span[1]")).click();
	
 }
     @Test  (priority = 10)
     public void Logout() throws InterruptedException
  {
	//URl
	 driver.get("https://www.lapcare.com/cart");
	 Thread.sleep(1000);
	//Click
    driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[3]/li")).click();		
    Thread.sleep(2000);
    //Logout
    driver.findElement(By.xpath("//*[@id=\"menu-list-grow\"]/li[3]")).click();
  }

  @AfterTest
  public void afterTest() 
  {
	 driver.close();
	  
  }

}

