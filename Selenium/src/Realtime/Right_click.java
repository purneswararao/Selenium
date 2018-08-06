package Realtime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_click {
	public static WebDriver driver;

	public static void main(String[] args) {
		try {
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			driver.get("https://www.facebook.com");
			driver.findElement(By.id("email")).sendKeys("purneswararao234@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("Purna-234");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			Thread.sleep(100);
			WebElement element=driver.findElement(By.xpath("//a[@id='pageLoginAnchor']"));
			Actions action =new Actions(driver);
			action.moveToElement(element).click().build().perform();
			WebElement element1=driver.findElement(By.xpath("(//a[@class='_54nc'])[9]"));
			action.contextClick(element1).perform();
			driver.close();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
