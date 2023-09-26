package automationAll;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverVtiger {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
		public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.vtiger.com");
		Actions a=new Actions(driver);
		WebElement resource = driver.findElement(By.xpath("(//a[@id='navbarPages'])[2]"));
		a.moveToElement(resource).perform();
		driver.findElement(By.xpath("(//a[contains(text(),'Customers')])[1]")).click();
		

}
}
