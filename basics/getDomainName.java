package basics;

import java.net.URI;
import java.net.URISyntaxException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getDomainName {

	public static void main(String[] args) throws URISyntaxException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "/home/ish/chromedriver");	
		
		WebDriver driver =new ChromeDriver();
			
		String baseUrl="https://www.facebook.com/";
		driver.get(baseUrl);
		URI uri=new URI(driver.getCurrentUrl());
		System.out.println(uri.getHost()+" "+uri.getPort());
	}

}
