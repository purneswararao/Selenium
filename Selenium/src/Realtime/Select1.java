package Realtime;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Select1 {
	public static WebDriver driver;
	public static WebElement element;
	public static void main(String[] args) {
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("purna");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("p");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("purna@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("purna@gmail.com");
		driver.findElement(By.xpath("//input[@type[normalize-space()]='password']")).sendKeys("purna143");
		element=driver.findElement(By.xpath("//select[@id='day']"));
		Select s1=new Select(element);
		s1.selectByValue("15");
		s1.selectByValue("8");
		WebElement element1=driver.findElement(By.xpath("//select[@id='month']"));
		Select s2=new Select(element1);
		s2.selectByValue("3");
		s2.selectByValue("11");
		WebElement element3=driver.findElement(By.xpath("//select[@id='year']"));
		Select s3=new Select(element3);
		s3.selectByValue("2018");
		s3.selectByValue("1991");
	   driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
	   java.util.List<WebElement> element5=driver.findElements(By.tagName("img"));
	   System.out.println(element5.size());
		
	}

}
