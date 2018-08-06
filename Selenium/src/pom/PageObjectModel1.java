package pom;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Realtime.Screenshot1;



public class PageObjectModel1 {
	public static WebDriver driver;
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			driver.get("https://www.facebook.com");
			PageObjectModel po=new PageObjectModel(driver);
			po.login("purneswararao234@gmail.com", "Purna-234");
			try {
				Screenshot1.screenshot(driver, "login page");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			po.logout();
			try {
				Screenshot1.screenshot(driver, "logout");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}


