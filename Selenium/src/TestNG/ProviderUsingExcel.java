package TestNG;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import Realtime.ReadData;


public class ProviderUsingExcel {
	public static WebDriver driver;
@DataProvider(name="Basic")
	public Object[][] fbPage() {
		ReadData rd=new ReadData("C:\\Users\\pc\\Desktop\\TestSheet.xlsx");
		int rows=rd.RowCount(0);
		int cells=rd.cellCount(0);
		Object[][] data=new Object[rows][cells];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cells;j++) {
				data[i][j]=rd.getData(0, i,j);
				System.out.println("data[]i[j]");
			}
	}
		return data;
}
@Test(dataProvider="Basic")
public void loginPage(String uname,String pwd) {

		try {
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			driver.get("https://www.facebook.com");
			driver.findElement(By.id("email")).sendKeys(uname);
			driver.findElement(By.id("pass")).sendKeys(pwd);
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			driver.quit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
	
	}

