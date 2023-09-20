package automationAll;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeOut {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
		public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(2,TimeUnit.SECONDS);
		try {
			driver.get("https://demo.actitime.com");
			System.out.println("Login Page loading within 2 second");
		} catch (Exception e) {
System.out.println("Login Page is not loading within 2 second");
		}
		driver.close();

}
}
