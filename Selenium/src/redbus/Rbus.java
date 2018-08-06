package redbus;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Rbus {
	public static WebDriver driver ;
	@BeforeMethod
	public void browserLanuch() {
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
@Test
public void bus1()
{
	driver.navigate().to("https://www.redbus.in/");
	driver.findElement(By.xpath("//input[@type='text']//parent::div//input[@id='src']")).sendKeys("guntur");
	driver.findElement(By.xpath("//input[@type='text']//parent::div//input[@id='dest']")).sendKeys("hyderabad");
	driver.findElement(By.xpath("//button[text()='Search Buses']")).click();
	
}
}
