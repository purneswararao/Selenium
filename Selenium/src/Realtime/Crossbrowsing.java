package Realtime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Crossbrowsing {
	public static WebDriver driver;
	public Crossbrowsing(WebDriver driver) {
		Crossbrowsing.driver=driver;
	}
	
	public  WebDriver browser(String browser) {
		if(browser.equalsIgnoreCase("Firefox")) {
			driver=new  FirefoxDriver();
			System.out.println("Firefox");
		}else if(browser.equalsIgnoreCase("Chrome")) {
			String path="F:\\selenium& java\\softwares\\jars\\jars for various drivers\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver",path);
			driver=new  ChromeDriver();
			System.out.println("Chrome");
		}else if(browser.equalsIgnoreCase("IE")) {
			String path="F:\\selenium& java\\softwares\\jars\\jars for various drivers\\IEDriverServer.exe";
			System.setProperty("webdriver.ie.driver",path);
			driver=new  InternetExplorerDriver();
			System.out.println("IE");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	return driver;
	}
}
