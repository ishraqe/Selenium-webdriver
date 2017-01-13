package LocatingObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/ish/chromedriver");	
		WebDriver driver =new ChromeDriver();
		String baseUrl="https://www.google.com/";
		driver.get(baseUrl);
		
		String fb="https://www.facebook.com/";
		
		driver.navigate().to(fb);
		
		driver.navigate().back();//goes to google
		
		driver.navigate().forward();//fb
		

	}

}
