package automationAll;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukariResume {
	static{
		System.setProperty("webdriver.chrome.driver",
		"./driver/chromedriver.exe");
		}
		public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.id("login_Layer")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).
		sendKeys("eramitkverma84340@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Amit@9504");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		driver.findElement(By.xpath("//div[@class='view-profile-wrapper']")).click();
		driver.findElement(By.xpath("//div[@class='uploadBtn']")).click();
		Thread.sleep(3000);
		File f=new File("./data/Amit1 (1).pdf");
		String absolutePath = f.getAbsolutePath();
		driver.findElement(By.xpath("(//input[@class='fileUpload waves-effect waves-light btn-large'])[1]")).
		sendKeys(absolutePath);
}
}
