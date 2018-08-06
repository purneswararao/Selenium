package project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Actitime_1 {
	public static WebDriver driver;
	@Test()
	public void test1() {
		driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/zen3/login.do");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//input[@type='text' and @name='username']")).sendKeys("purneswararao91");
	        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Actitime");
		    driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		    driver.findElement(By.xpath("//span[text()='New']")).click();
		}
		@Test(enabled=false)
		public void test2() {
			WebElement element=driver.findElement(By.xpath("//div[@id='createTasksPopup_customerSelector']/table/tbody/tr/td[2]"));
			Actions act =new Actions(driver);
			act.moveToElement(element).click().build().perform();
			WebElement element1=driver.findElement(By.xpath("//div[@id='ext-gen111']/ul/li[5]/a"));
			act.moveToElement(element1).click().build().perform();
		}
		@Test()
		public void test3() {
			WebElement element2=driver.findElement(By.xpath("//div[contains(@id,'createTasksPopup_projectSelector')]/table/tbody/tr/td[2]/em"));
		    Actions act =new Actions(driver);
			act.moveToElement(element2).click().build().perform();
			WebElement element3=driver.findElement(By.xpath("//div[contains(@class,'x-layer x-menu at-dropdown-list-btn-menu scrollable customerProjectListSelector projectListSelector createTasksCustomerProjectSelector')]/ul/li[3]/a"));
			//element3.click();
			act.moveToElement(element3).click().build().perform();
			driver.findElement(By.xpath("//div[contains(@class,'greyButton cancelBtn')]")).click();
			driver.switchTo().alert().accept();
		}
		
		@AfterTest
		public void closeBrowser() {
			driver.findElement(By.linkText("Logout")).click();
			driver.quit();
		}

}
