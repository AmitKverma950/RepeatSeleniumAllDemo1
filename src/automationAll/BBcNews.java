package automationAll;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BBcNews {
		static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
		public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bbc.com/");
		 List<WebElement> text = driver.findElements(By.xpath("//div[@class='most-popular']/div/ul/li"));
		int count = text.size();
		for(int i=0; i<=count-1; i++) {
			String te = text.get(i).getText();
			System.out.println(te);
		}
		
		driver.close();
}
		
}

