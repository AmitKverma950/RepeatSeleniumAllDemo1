package automationAll;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextTagClass {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
		public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement result =	driver.findElement(By.name("login"));
		String tagname = result.getTagName();
		String text = result.getText();
		String attribut = result.getAttribute(tagname);
		Class<? extends WebElement> Class = result.getClass();
		System.out.println(tagname);
		System.out.println(text);
		System.out.println(Class);
		System.out.println(attribut);
		
}
}
