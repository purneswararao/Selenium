package Realtime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAct {
	public static WebDriver driver;
	public static WebElement element;
	public static void main(String[] args) {
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("http://www.demo.guru99.com/");
		element=driver.findElement(By.partialLinkText("Selenium"));
       Actions act=new Actions(driver);
      WebElement subelement=driver.findElement(By.xpath("//a[text()='Login']"));
      act.moveToElement(element).click().build().perform();
      act.moveToElement(subelement).click().build().perform();
      driver.navigate().back();
	}

}
