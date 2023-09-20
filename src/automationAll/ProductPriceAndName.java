package automationAll;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductPriceAndName {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
		public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone12"+ Keys.ENTER);
		List<WebElement> ipho = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		List<WebElement> pri = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		int count = ipho.size();
		System.out.println(count);
		
		/*	for(int k=0; k<count; k++) {
			String iphone = ipho.get(k).getText();
			String prize = pri.get(k).getText();
			System.out.println(iphone +"------>" +prize);
		}
		*/
		int prize=pri.size();         //// Another way to print  
		for(int i=1; i<=count; i++) {
			String iphones=ipho.get(i).getText();
			for(int j=1; j<=prize; j++) {
				String price = pri.get(j).getText();
				
				System.out.println(iphones + "----->" + price );
			}
		}  
		driver.close();
		}
}
