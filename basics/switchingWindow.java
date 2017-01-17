package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchingWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/ish/chromedriver");    

		WebDriver driver = new ChromeDriver();

		driver.get("http://google.com");

		String firstWindowHandle = driver.getWindowHandle();

		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"n");
		try {
		    Thread.sleep(3000);
		    for(String windowHandle : driver.getWindowHandles()) {
		        if (!windowHandle.equals(firstWindowHandle)) {
		            driver.switchTo().window(windowHandle);
		        }
		    }
		    driver.get("http://fb.com");
		} catch (Exception e) {
		    System.out.println(e);
		}

	}

}
