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

import Realtime.Screenshot1;

public class Checkbox2 {
	public static WebDriver driver;
	@BeforeMethod
	public void invokeBrowser() {
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
}
	@Test
	public void login() {
		try {
			driver.get("http://toolsqa.com/automation-practice-form/");
			JavascriptExecutor jse1=(JavascriptExecutor) driver;
			jse1.executeScript("scroll(0,500)");
			List<WebElement> radio=driver.findElements(By.name("profession"));
int isize=radio.size();
System.out.println(isize);
for(int i=0;i<isize;i++) {
			String sValue=radio.get(i).getAttribute("value");
			System.out.println(sValue);
			if(sValue.equalsIgnoreCase("Automation Tester")) {
			radio.get(i).click();
			Screenshot1.screenshot(driver, "Automation Tester");
			//System.out.println("selenium webdriver is selected");
				break;
			}
}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	try {
		Thread.sleep(100);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	//driver.close();
	}
}

