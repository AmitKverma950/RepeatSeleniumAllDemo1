package automationAll;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
		public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//a[.='Create new account']")).click();
		WebElement monthList = driver.findElement(By.name("birthday_month"));
		WebElement dayList = driver.findElement(By.name("birthday_day"));
		Select s= new Select(monthList);
		s.selectByIndex(4);
		Select s1=new Select(dayList);
		s1.selectByValue("14");
		
		//driver.close();
}
}
