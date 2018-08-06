package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FileUpload {
	public static WebDriver driver;
	@Test
	public void test1() {
		driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.guru99.com/become-an-instructor.html");
	}
@Test
public void test3() {
	driver.findElement(By.id("//h2[@id='header_6']"));
	driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("purna");
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("purnaputtigampala@gmail.com");
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("selenium");
	driver.findElement(By.linkText("Browse Files")).click();
}
}
