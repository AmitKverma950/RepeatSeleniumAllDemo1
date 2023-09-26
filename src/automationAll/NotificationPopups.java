package automationAll;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopups {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
		public static void main(String[] args) throws InterruptedException {
ChromeOptions co=new ChromeOptions();

co.addArguments("--disable-notifications");
WebDriver d=new ChromeDriver(co);
d.manage().window().maximize();
Thread.sleep(3000);
d.get("https://www.yatra.com/");
}
}
