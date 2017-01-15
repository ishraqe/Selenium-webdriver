package LocatingObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import basics.chrome;

public class selectAlltext {

	public static void main(String[] args) {
		WebDriver driver=chrome.chDriver();
		driver.get("http://fb.com");
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"a");

	}

}
