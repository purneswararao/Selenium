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

public class Checkbox {
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
		jse1.executeScript("scroll(0,1000)");
		List<WebElement> radio=driver.findElements(By.xpath("//input[@name='exp' and @type='radio']"));
	int isize=radio.size();
	System.out.println(isize);
	for(int i=0;i<isize;i++) {
		String sValue=radio.get(i).getAttribute("value");
		System.out.println(sValue);
		if(sValue.equalsIgnoreCase("4")) {
		radio.get(i).click();
		try {
			Screenshot1.screenshot(driver, "exp-4");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			break;
		}
	}
	
	}
}
