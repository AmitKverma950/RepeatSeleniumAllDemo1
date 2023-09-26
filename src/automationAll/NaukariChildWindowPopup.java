package automationAll;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukariChildWindowPopup {
	static{
		System.setProperty("webdriver.chrome.driver",
		"./driver/chromedriver.exe");
		}
		public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Set<String> wh = driver.getWindowHandles();
		int count = wh.size();
		System.out.println(count);
		for(String text:wh) {
			System.out.println(text);
		}
		driver.close();
		
}
}
