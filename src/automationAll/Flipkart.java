package automationAll;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String arg []) throws InterruptedException {
	WebDriver d= new ChromeDriver();
	d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	d.manage().window().maximize();
	d.get("https://www.flipkart.com");
	d.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	d.findElement(By.name("q")).sendKeys("iphone");
	Thread.sleep(3000);
	List<WebElement> AutoSugg = d.findElements(By.tagName("li"));
	int count = AutoSugg.size();
	System.out.println(count);
	for(int i=0; i<count; i++) {
		String text = AutoSugg.get(i).getText();
		System.out.println(text);
	}
	d.close();
	
}
}
