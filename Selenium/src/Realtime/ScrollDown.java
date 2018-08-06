package Realtime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScrollDown {
	public static WebDriver driver;
	@BeforeMethod
	public void invokeBrowser() {
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
}
@Test
public void login() {
	driver.get("https://www.facebook.com");
	JavascriptExecutor jse=(JavascriptExecutor) driver;
	jse.executeScript("scroll(0,400)");
	driver.findElement(By.id("email")).sendKeys("purneswararao234@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("Purna-234");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	//Thread.sleep(100);
	JavascriptExecutor jse1=(JavascriptExecutor) driver;
	jse1.executeScript("scroll(0,400)");
	driver.quit();
}
}
