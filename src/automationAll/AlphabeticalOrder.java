package automationAll;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlphabeticalOrder {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		
		ArrayList<String >ts= new ArrayList<String>();
		WebDriver d= new ChromeDriver();
		d.get("file:///C:/Users/Abhishek%20Ranjan/OneDrive/Desktop/mtr.html");
		WebElement car = d.findElement(By.id("cars"));
		Select s=new Select(car);
		List<WebElement> alloptions = s.getOptions();
		int count = alloptions.size();
		for(int i=0; i<=count-1; i++) {
			String text = alloptions.get(i).getText();
			System.out.println(text);
			ts.add(text);
		}
		Collections.sort(ts);
		System.out.println("    ");
		for(int j=0; j<=ts.size()-1; j++) {
			System.out.println(ts.get(j));
		}
		
		d.close();
		
}
}
