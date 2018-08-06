package radiobuttons;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Realtime.Screenshot1;

public class CheckBxRadioBtn {
	public static WebDriver driver;
	@BeforeMethod
	public void invokeBrowser() {
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
}
	@Test(priority=1,enabled=true)
	public void login() {
		driver.get("http://toolsqa.com/automation-practice-form/");
		JavascriptExecutor jse1=(JavascriptExecutor) driver;
		jse1.executeScript("scroll(0,1000)");
		List<WebElement> chkBx_Profession = driver.findElements(By.xpath("//input[@name='profession' and @type='checkbox']"));
		int iSize = chkBx_Profession.size();
		for(int i=0; i < iSize ; i++ ){
			String sValue = chkBx_Profession.get(i).getAttribute("Value");
			if (sValue.equalsIgnoreCase("Manual Tester")){
			 chkBx_Profession.get(i).click();
			 try {
				Screenshot1.screenshot(driver, "manual tester");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				break;
		}
	}
	}
		@Test(priority=2,enabled=false)
		public void login1() {
			driver.get("http://toolsqa.com/automation-practice-form/");
			JavascriptExecutor jse1=(JavascriptExecutor) driver;
			jse1.executeScript("scroll(0,1200)");
			List<WebElement> chkBx = driver.findElements(By.xpath("//input[@name='tool' and @type='checkbox']"));
			int isize=chkBx.size();
			System.out.println(isize);
			for(int i=0; i < isize ; i++ ){
				String sValue = chkBx.get(i).getAttribute("Value");
				if (sValue.equalsIgnoreCase("Selenium Webdriver")){
					
				chkBx.get(i).click();
				try {
					Screenshot1.screenshot(driver, "Selenium Webdriver");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					break;
			}
		}
	}
		
      @AfterMethod
        public void teardown() {
	   driver.quit();
}
}
