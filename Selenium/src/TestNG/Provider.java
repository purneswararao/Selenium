package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Realtime.Screenshot1;



public class Provider {
	public static WebDriver driver;
	@DataProvider(name="Basic")
	public Object[][] fbPage() {
		return new Object[][]{{"purneswararao91@gmail.com","Purna-123"},{"purneswararao234@gmail.com","Purna-234"}};
	}
	@Test(dataProvider="Basic")
	public void loginPage(String uname,String pwd) {
		
			try {
				driver=new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
				driver.get("https://www.facebook.com");
				driver.findElement(By.id("email")).sendKeys(uname);
				driver.findElement(By.id("pass")).sendKeys(pwd);
				driver.findElement(By.xpath("//input[@type='submit']")).click();
				SoftAssert sf=new SoftAssert();
				sf.assertTrue(true);
				Screenshot1.screenshot(driver, "login successfully");
				sf.assertAll();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
	}
		@Test
		public void logout1() {
			try {
				WebElement element=driver.findElement(By.xpath("//div[@id='userNavigationLabel']"));
				Actions act =new Actions(driver);
				act.moveToElement(element).click().build().perform();
				WebElement subelement=driver.findElement(By.xpath("(//a[@class='_54nc'])[9]"));
				act.moveToElement(subelement).click().build().perform();
				Screenshot1.screenshot(driver, "login successfully");
				driver.quit();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
}

