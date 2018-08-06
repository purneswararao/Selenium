package Realtime;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Windowhandles {
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
			driver.get("http://demo.guru99.com/popup.php");
			Screenshot1.screenshot(driver, "guru99 homepage");
			driver.findElement(By.xpath("//a[text()='Click Here']")).click();
			String mainPage=driver.getWindowHandle();
			Set<String> handles=driver.getWindowHandles();
			Iterator<String> itr=handles.iterator();
			while(itr.hasNext()) {
				String ChildWindow=(String) itr.next();
			if(!mainPage.equalsIgnoreCase(ChildWindow)) {
				driver.switchTo().window(ChildWindow);
				Screenshot1.screenshot(driver, "guru99 child homepage");
			driver.findElement(By.name("emailid")).sendKeys("purneswararao91@gmail.com");
			driver.findElement(By.name("btnLogin")).click();
			driver.close();
			}
			}
			Screenshot1.screenshot(driver, "guru99 homepage");
			driver.switchTo().window(mainPage);
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}