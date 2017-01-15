package LocatingObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import basics.chrome;

public class scrollToelement {

	public static void main(String[] args) {
	WebDriver driver=chrome.chDriver();
	driver.get("http://fb.com");
	
	JavascriptExecutor je=(JavascriptExecutor)driver;
	je.executeScript("arguments[0].scrollIntoView(true)",driver.findElement(By.linkText("Help")));
	}

}
