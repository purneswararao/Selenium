package project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Acttime_3 {
	public static WebDriver driver;
	Acttime_3(){
		Acttime_3.driver=driver;
	}
	public static void invokeBrowser(String url) {
		driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
			
	public static void dynamic_Table2(String uid,String pwd) {
		driver.findElement(By.xpath("//input[@type='text' and @name='username']")).sendKeys(uid);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
	    driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
	    driver.findElement(By.xpath("//span[text()='New']")).click();
	    String data=driver.findElement(By.xpath("//div[@id='createTasksPopup_createTasksTableContainer']/table/tbody/tr[1]/td[1]/input")).getText();
	    driver.findElement(By.xpath("//div[@id='createTasksPopup_createTasksTableContainer']/table/tbody/tr[1]/td[1]/input")).sendKeys("purna");
		System.out.println(data);
			WebElement element4=driver.findElement(By.xpath("//div[contains(@id,'createTasksPopup_createTasksTableContainer')]/table/tbody/tr[1]/td[2]/table/tbody/tr/td/a"));
			WebElement element5=driver.findElement(By.xpath("//div[contains(@id,'editDescriptionPopup')]/table/tbody/tr[2]/td/table/tbody/tr[1]/td/div[1]/textarea"));
			Actions act =new Actions(driver);
			act.moveToElement(element4).click().build().perform();
			element5.sendKeys("hi");
			WebElement element6=driver.findElement(By.xpath("//div[contains(@id,'editDescriptionPopup')]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/input[1]"));
	       act.moveToElement(element6).click().build().perform();
	     // WebElement element7=driver.findElement(By.xpath("//div[@id='createTasksPopup_createTasksTableContainer']/table/tbody/tr[1]/td[3/input"));
	      //element7.sendKeys("hi");
	        driver.findElement(By.xpath("//div[contains(@id,'createTasksPopup_createTasksTableContainer')]/table/tbody/tr[1]/td[6]")).click();
		driver.switchTo().alert().accept();
	}
	public static void closeBrowser() {
		driver.findElement(By.linkText("Logout")).click();
		driver.quit();
	}
}
