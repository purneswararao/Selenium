package Realtime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectoperation {
	public static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		driver = new FirefoxDriver();
		 driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

       driver.get("http://toolsqa.com/Automation-practice-form/");

       // WebElement element=driver.findElement(By.id("continents"));
       //Select select =new Select(element);
       //select.selectByVisibleText("Europe");
       //select.selectByVisibleText("Antartica");
       
       WebElement element=driver.findElement(By.id("selenium_commands"));
       Select select =new Select(element);
       select.selectByVisibleText("Wait Commands");
       Thread.sleep(100);
       select.deselectByVisibleText("Wait Commands");
       Thread.sleep(100);
       select.selectByVisibleText("Switch Commands");
       Thread.sleep(100);
       select.deselectByVisibleText("Switch Commands");
       Thread.sleep(100);
       select.selectByIndex(2);
       
        
       

	}

}
