package objectrepository;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;





public class OR {
	public static WebDriver driver;
	@Test
	public void geturl() throws FileNotFoundException {
					File src=new File("C:\\Users\\pc\\eclipse-workspace\\Selenium\\Configuration\\Config.property");
					FileInputStream  fis=new FileInputStream(src);
					Properties pro=new Properties();
					try {
						pro.load(fis);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					//String f_url=pro.getProperty("URL");  
					//System.out.println("url1");
					//String uid = pro.getProperty("user_id");
					//String pwd=pro.getProperty("user_pwd");
					//String login=pro.getProperty("login_btn");
					//System.out.println(uid+" "+pwd+" "+login);
					String url2=pro.getProperty("G_url");  
					System.out.println("url2");
					String uid1 = pro.getProperty("G_uid");
					String pwd1=pro.getProperty("G_pwd");
					String login1=pro.getProperty("G_login");
					System.out.println(uid1+" "+pwd1+" "+login1);
					
					
	try {
		driver=new FirefoxDriver();
		driver.get(url2);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.findElement(By.xpath(uid1)).sendKeys("purnaputtigampala@gmail.com");
		driver.findElement(By.xpath(login1)).click();
		Thread.sleep(100);
		driver.findElement(By.xpath(pwd1)).sendKeys("9618482538");
		driver.findElement(By.xpath(login1)).click();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	}

}
