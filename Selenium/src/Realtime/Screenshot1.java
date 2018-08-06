package Realtime;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class Screenshot1 {
	public static WebDriver driver;
	public static void screenshot(WebDriver driver,String screenshotname) throws Exception{
		try {
			TakesScreenshot ts=(TakesScreenshot)driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("./ScreenShot/"+screenshotname+".png"));
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}

}
