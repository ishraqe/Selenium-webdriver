package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class switchingWindow {

	public static void main(String[] args) {
		WebDriver driver=chrome.chDriver();
		driver.get("http://google.com");
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"n");
		try {
			Thread.sleep(3000);
			for(String windowHandle:driver.getWindowHandles()){
				driver.switchTo().window(windowHandle);
			}
			driver.get("http://fb.com");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
