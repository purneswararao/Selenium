package project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Acttime_DDT {
	public static WebDriver driver;
	@Test(dataProvider="First")
	public void login(String uid,String pwd) {
		driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/zen3/login.do");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//input[@type='text' and @name='username']")).sendKeys(uid);
	        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
		    driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
	}
	@DataProvider(name="First")
	public  Object[][] acttime() {
		Act_Excelsheet.readExeel("C:\\Users\\pc\\Desktop\\TestSheet.xlsx");
		int rows=Act_Excelsheet.getRow(1);
		int columns=Act_Excelsheet.getColumn(1);
		Object[][] data=new Object[rows][columns];
		for(int i=0;i<=1;i++){
				data[i][0]=Act_Excelsheet.getData(1, i, 0);
				data[i][1]=Act_Excelsheet.getData(1, i, 1);
			}
		
		return data;
	}
}
