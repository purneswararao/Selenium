package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicTestNG {
	public static WebDriver driver;
	@BeforeMethod
	public void invokeBrowser() {
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
	}
	@Test
	public void login() {
		
		driver.findElement(By.id("email")).sendKeys("purneswararao234@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Purna-234");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement element=driver.findElement(By.xpath("//div[@id='userNavigationLabel']"));
		Actions act =new Actions(driver);
		act.moveToElement(element).click().build().perform();
		WebElement subelement=driver.findElement(By.xpath("(//a[@class='_54nc'])[9]"));
		act.moveToElement(subelement).click().build().perform();
		}
	@AfterMethod
	public void logout() {
		driver.quit();
	}

}
