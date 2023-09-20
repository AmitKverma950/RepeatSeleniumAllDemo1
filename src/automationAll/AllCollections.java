package automationAll;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllCollections {
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
		ts.add(text);
		ar.add(text1);
		ls.add(text2);
		hs.add(text3);
		
	}
	 for(String text:ts) {
	 }
	 
	 for(String text1:ar) {
	 }
	 Collections.sort(ar);
	 for(String text2:ls){
	 }
	 for(String text3:hs) {
	 }
 
 
System.out.println();
System.out.println(ts);
System.out.println(ar);
System.out.println(ls);
System.out.println(hs);
 
 d.close();
}
}
