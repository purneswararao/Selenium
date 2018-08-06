package Realtime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class Action {
	public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		
		driver = new FirefoxDriver();
		 driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
 
        driver.get("http://toolsqa.com/Automation-practice-form/");
 
         driver.findElement(By.linkText("Home")).click();
        WebElement element= driver.findElement(By.linkText("TUTORIAL"));
        Actions action =new Actions(driver);
        action.moveToElement(element).build().perform();
        driver.findElement(By.partialLinkText("Java")).click();
       Thread.sleep(100);
        driver.quit();
         
         
 
       
        
 

 
        }
 
}

