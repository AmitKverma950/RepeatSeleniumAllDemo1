package automationAll;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggession {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		//System.out.println(driver.getTitle());
		Thread.sleep(4000);
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(2000);
 List<WebElement> allsugge = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
 Thread.sleep(4000);
 int count = allsugge.size();
 
 System.out.println(count);

 for(int i=0; i<count; i++) {
	String textq = allsugge.get(i).getText();
	 System.out.println(textq);
	
 }
driver.close();
}
}
