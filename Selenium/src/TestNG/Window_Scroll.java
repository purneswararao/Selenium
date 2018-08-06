package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Window_Scroll {
	public static WebDriver driver;
	String url="https://online.actitime.com/zen3/login.do";
	@Test(priority=1)
	public void invokebrowser() {
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.navigate().to(url);
		driver.findElement(By.xpath("//input[@type='text' and @name='username']")).sendKeys("purneswararao91");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Actitime");
	    driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
	}
	@Test(priority=2)
	public void scroll123() {
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("scroll(0,600)");
	}

}
