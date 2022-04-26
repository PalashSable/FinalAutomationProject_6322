package lapcare;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Lapcare_POM 
{
	public void maximizeBrowser(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	public void url(WebDriver driver)
	{
		 driver.get("https://www.lapcare.com/login");
	}
	public void EMail(WebDriver driver, String usn)
	{
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/form/div[1]/div/input")).sendKeys(usn);
	}
	public void passWord(WebDriver driver, String pwd)
	{
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/form/div[2]/div/input")).sendKeys(pwd);
	}
	public void SigninButton(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/form/button/span[1]")).click();
				
	}
		public void HometButton(WebDriver driver)
	{
		driver.findElement(By.xpath("/html/body/div[1]/div/header/div/div[2]/li[6]/span")).click();             
	}
	public void HometButto(WebDriver driver)
	{
		driver.findElement(By.xpath("/html/body/div[1]/div/header/div/div[2]/div/div/div/div/div/div[1]/div/a/div/div/img")).click();		                
	}
	
	public void MyAccountButtonn(WebDriver driver)
	{
		driver.findElement(By.xpath("/html/body/div/header/div/div[3]/li")).click();
		//driver.close();	                
	}
	public void SignOutButton(WebDriver driver)
	{
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[3]/div/div/ul/li[3]")).click();
	}
	public void closebrowser(WebDriver driver) 
	{
		driver.close();
	}

	public static void main(String[] args) 
	{
		

	}
}
