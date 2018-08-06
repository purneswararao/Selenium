package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import Realtime.Screenshot1;

public class ScreenShot {
	public static WebDriver driver;

	@Test
	public void login() throws Exception {
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	//Screenshot1.screenshot(driver,"Browser invoked");
	Screenshot1.screenshot(driver, "Browser");
	driver.get("https://www.facebook.com");
	Screenshot1.screenshot(driver, "fb home page");
	driver.findElement(By.id("email")).sendKeys("purneswararao234@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("Purna-234");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Screenshot1.screenshot(driver, "fb login ");
	}	
}
