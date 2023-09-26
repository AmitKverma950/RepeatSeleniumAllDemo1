package automationAll;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
	
		public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\Abhishek Ranjan\\OneDrive\\Desktop\\Page1.html");
		driver.switchTo().frame(0);
		driver.findElement(By.id("t2")).sendKeys(Keys.SHIFT+"a");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).sendKeys(Keys.SHIFT+"d");
		driver.switchTo().frame(0);
		driver.findElement(By.id("t2")).sendKeys(Keys.SHIFT+"b");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).sendKeys(Keys.SHIFT+"e");
		WebElement frame = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(frame);
		driver.findElement(By.id("t2")).sendKeys(Keys.SHIFT+"c");
		Thread.sleep(3000);
}
}
