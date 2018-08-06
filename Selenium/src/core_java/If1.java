package core_java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class If1 {
	WebDriver driver;
	public void browser(String browser) {
		if(browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "path");
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Internetexplorerdriver")) {
			System.setProperty("webdriver.ie.driver", "path");
			driver=new InternetExplorerDriver();
		}else {
			System.out.println("enter valid browser");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}
	public static void main(String[] args) {
		If1 d =new If1();
		d.browser("firefox");
	}

}
