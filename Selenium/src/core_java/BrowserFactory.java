package core_java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	public static WebDriver driver;
	public static WebDriver  get(String browser) {
		switch(browser) {
		case "Firefox":
			System.out.println("FirefoxDriver"); 
			driver =new FirefoxDriver();
			break;
		case "Chrome":
			System.out.println("ChromeDriver"); 
			driver =new ChromeDriver();
			break;
		default:System.out.println("invalid browser"); 
		}
	return driver;
	}

	public static void main(String[] args) {
		BrowserFactory.get("Firefox");
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.quit();
	}

}
