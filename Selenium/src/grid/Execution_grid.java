package grid;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Execution_grid {
	public static WebDriver driver;
	
	@Test
	public void browserlaunch() throws Exception {
		String url1="https://www.facebook.com/";
		String node="http://192.168.225.1:4444/wd/hub";
		DesiredCapabilities cap =DesiredCapabilities.firefox();
		URL url =new URL(node);
		driver=new RemoteWebDriver(url,cap);
		driver.get(url1);
		Thread.sleep(3000);
		driver.quit();
	}

}
