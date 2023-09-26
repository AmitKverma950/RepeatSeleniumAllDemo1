package automationAll;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTabIterator {
	static{
		System.setProperty("webdriver.chrome.driver",
		"./driver/chromedriver.exe");
		}
		public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> allWh=driver.getWindowHandles();
		Iterator<String> itr = allWh.iterator();
		String pwh = itr.next();
		String cwh = itr.next();
		Thread.sleep(3000);
		driver.switchTo().window(pwh);
		driver.close();
		driver.switchTo().window(cwh);
		
		driver.close();
		}
}
