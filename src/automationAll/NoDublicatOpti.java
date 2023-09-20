package automationAll;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NoDublicatOpti {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
	TreeSet<String> ts=new TreeSet<String>();
	ArrayList<String>ar= new ArrayList<String>();
	LinkedList<String>ls= new LinkedList<String>();
	HashSet<String> hs =new HashSet<String>();
	
	
	WebDriver d= new ChromeDriver();
	d.get("C:\\Users\\Abhishek Ranjan\\OneDrive\\Desktop\\mtr.html");
	WebElement selectElem = d.findElement(By.name("cars"));
	Select s=new Select(selectElem);
	List<WebElement> allopts = s.getOptions();
 int count = allopts.size();
	
 System.out.println(count);
 for(int i=0; i<=count-1; i++) {
		String text = allopts.get(i).getText();
		String text1 = allopts.get(i).getText();
		String text2 = allopts.get(i).getText();
		String text3 = allopts.get(i).getText();
		//System.out.println(text);
		hs.add(text);
		ts.add(text);
		ar.add(text);
		ls.add(text);
	}
 for(String text:hs) {
	 	 System.out.println(text);
 }
 
 for(String text1:ts) {
	 System.out.println(text1);
 }
 for(String text2:ar) {
	 System.out.println(text2);
 }
 for(String text3:ls) {
	 System.out.println(text3);
 }
 d.close();
}
}
