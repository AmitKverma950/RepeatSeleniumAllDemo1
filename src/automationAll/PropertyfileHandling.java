package automationAll;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class PropertyfileHandling {
@Test	
public void main() throws IOException  {
	FileInputStream fis=new FileInputStream("./data/PeopleGrove.properties");
	Properties p=new Properties();
	p.load(fis);
	String url = p.getProperty("Url");
	System.out.println(url);
	String FirstName = p.getProperty("Fn");
	System.out.println(FirstName);
	String LastName = p.getProperty("Ln");
	System.out.println(LastName);
	String email = p.getProperty("email");
	System.out.println(email);
	String pass = p.getProperty("password");
	System.out.println(pass);
	
	
}
}
