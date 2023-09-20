package automationAll;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintColor {
	static {
		System.setProperty("webdriver.chrome.driver",
		"./driver/chromedriver.exe");
		}
		public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		String colo = driver.findElement(By.name("login")).getCssValue("color");
		System.out.println(colo);
		String font= driver.findElement(By.name("login")).getCssValue("font");
		System.out.println(font);
		driver.close();
		
}
}
