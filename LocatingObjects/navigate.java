package LocatingObjects;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class navigate {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/home/ish/geckodriver");	
		
		DesiredCapabilities capabilities=DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		
		try {
			WebDriver driver =new FirefoxDriver();
			String baseUrl="https://www.google.com/";
			driver.get(baseUrl);
			
			String fb="https://www.facebook.com/";
			
			driver.navigate().to(fb);
			
			driver.navigate().back();//goes to google
			
			driver.navigate().forward();//fb
			driver.navigate().refresh();
			Thread.sleep(1800);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
	
		

	}

}
