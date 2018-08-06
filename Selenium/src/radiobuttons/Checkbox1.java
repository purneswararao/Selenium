package radiobuttons;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Checkbox1 {
	public static WebDriver driver;
	@BeforeMethod
	public void invokeBrowser() {
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
}
	@Test
	public void login() {
		driver.get("http://toolsqa.com/automation-practice-form/");
		JavascriptExecutor jse1=(JavascriptExecutor) driver;
		jse1.executeScript("scroll(0,500)");
		List<WebElement> radio=driver.findElements(By.name("tool"));
	int isize=radio.size();
	System.out.println(isize);
	for(int i=0;i<isize;i++) {
		String sValue=radio.get(i).getAttribute("value");
		System.out.println(sValue);
		if(sValue.equalsIgnoreCase("Selenium Webdriver")) {
		radio.get(i).click();
		System.out.println("selenium webdriver is selected");
			break;
		}
	}
	
	//driver.close();
	}
}

