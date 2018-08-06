package pom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PageObjectModel {
	static By username=By.id("email");
	static By passwd=By.id("pass");
	static By loginbtn=By.xpath("//input[@type='submit']");
	public static WebDriver driver;
PageObjectModel(WebDriver driver){
	PageObjectModel.driver=driver;
}
public void login(String uid,String pwd ) {
	driver.findElement(username).sendKeys(uid);
	driver.findElement(passwd).sendKeys(pwd);
    driver.findElement(loginbtn).click();
	
}
	public void logout() {
		WebElement element=driver.findElement(By.xpath("//a[@id='pageLoginAnchor']"));
	    Actions action =new Actions(driver);
		action.moveToElement(element).click().build().perform();
		driver.findElement(By.xpath("(//a[@class='_54nc'])[9]")).click();
		driver.close();
	}
}

