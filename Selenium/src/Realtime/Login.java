package Realtime;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Login {
	public static WebDriver driver;
	public static WebElement element;
	@Test
	public void signIn() {
		try {
			
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			driver.get("https://accounts.google.com");
			try {
				Screenshot1.screenshot(driver,"browserinvoked");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys("purnaputtigampala");
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			driver.findElement(By.name("password")).sendKeys("9618482538");
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void test1() {
		driver.findElement(By.xpath("//a[@class='WaidBe']")).click();
		driver.findElement(By.xpath("(//span[@name='Facebook'])[1]/../../..//div[@role='checkbox']")).click();
	}
	
	@Test
	public void test2() {
		try {
			driver.findElement(By.xpath("//div[text()='COMPOSE']")).click();
            driver.findElement(By.xpath("//textarea[@dir='ltr']")).sendKeys("purnaputtigampala@gmail.com");
			driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("practice mail");
			driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys("hai");
			driver.findElement(By.xpath("//div[@class=\"a1 aaA aMZ\"]")).click();
			Runtime.getRuntime().exec("C:\\Users\\pc\\Desktop\\Resume.exe");
			driver.findElement(By.xpath("//div[text()='Send']")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.navigate().refresh();
	}
	
}
