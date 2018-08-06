package Realtime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Browserinvoke {
	public static WebDriver driver;
	public boolean bValue ;
	WebElement element;
	

	public static void main(String[] args) throws Exception {
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com");
	//System.out.println(driver.getTitle());
	//String expected ="Facebook – log in or sign up";
	//Assert.assertEquals(driver.getTitle(),expected);
	Assert.assertTrue(driver.getTitle().contains("Facebook – log in or sign up"));
	Thread.sleep(100);
	//WebElement element=driver.findElement(By.id("email"));
    //driver.findElement(By.id("email")).sendKeys("purneswararao234@gmail.com");
	//driver.findElement(By.id("pass")).sendKeys("Purna-234");
	WebElement element=driver.findElement(By.xpath("//input[@type='submit']"));
	Assert.assertTrue(element.isEnabled());
	System.out.println("login");
//boolean bValue =driver.getTitle().contentEquals("(44) Facebook");
//System.out.println(bValue);
	
	//Thread.sleep(100);
   // WebElement element=driver.findElement(By.xpath("//div[@id='userNavigationLabel']"));
	//Actions act =new Actions(driver);
	//act.moveToElement(element).moveToElement(driver.findElement(By.partialLinkText("Log"))).click().build().perform();
	//driver.findElement(By.partialLinkText("Log")).click();
	
	driver.quit();
	}

}
