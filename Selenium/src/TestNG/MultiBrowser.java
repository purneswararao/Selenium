package TestNG;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Realtime.Crossbrowsing;
import Realtime.Screenshot1;

public class MultiBrowser {
	public static WebDriver driver;
	@Test
	public void login() throws Exception {
	Crossbrowsing cb=new Crossbrowsing(driver);
	cb.browser("Firefox");
	driver.get("https://www.facebook.com");
	Screenshot1.screenshot(driver, "Browser");
	driver.get("https://www.facebook.com");
	Screenshot1.screenshot(driver, "fb home page");
	driver.findElement(By.id("email")).sendKeys("purneswararao234@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("Purna-234");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Screenshot1.screenshot(driver, "fb login ");
	}	
}


