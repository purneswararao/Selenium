package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Execution1 {
public static WebDriver driver;
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		String URL = "https://www.facebook.com/";
 		String Node = "http://192.168.1.164:5555/wd/hub";
 		DesiredCapabilities cap = DesiredCapabilities.firefox();
 		driver = new RemoteWebDriver(new URL(Node), cap);
 		driver.navigate().to(URL);
 		Thread.sleep(5000);
 		driver.quit();
	}

}
