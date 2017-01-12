package LocatingObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class variousLocatiors {

	public static void main(String[] args) {
	
		//https://github.com/mozilla/geckodriver/releases download the latest gecodriver
		
		System.setProperty("webdriver.gecko.driver", "/home/ish/geckodriver");	
	//System.setProperty("webdriver.chrome.driver",  "/home/ish/chromedriver");
		
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		System.out.println(driver.getTitle());
		
		
		/*
		 *  System.out.println(driver.getPageSource()); prints the page source 
		 * 
		 *  driver.findElement(By.xpath(".//*[@id='email']")).clear();
			driver.findElement(By.xpath(".//*[@id='pass']")).clear();
		    driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("ishman");
		    driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("password");
		    
		    locating with web elements
		    
		    WebElement email=driver.findElement(By.xpath(".//*[@id='email']"));
			email.sendKeys("ish");
		
		    driver.findElement(By.tagName("a"));
			driver.findElement(By.className("classname"));
			driver.findElement(By.id("id"));
			driver.findElement(By.linkText("hello"));
			driver.findElement(By.partialLinkText(""));
			driver.findElement(By.cssSelector("css"));
		    
		 */
		
		
		
		
		driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
		System.out.println(driver.findElement(By.xpath(".//*[@id='content']/div[1]/div/div/div/div[2]/div[1]/div[1]/span")).getText().toString());
		
		
	}

}
