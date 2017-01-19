package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class zoomInOut {

	public static void main(String[] args) {
		
		WebDriver driver=chrome.chDriver();
		driver.get("http://fb.com");
		try {
//			for(int i=0; i<4; i++){   
//				  driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, Keys.ADD));
//				  }
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("document.body.style.zoom='130%'");
			Thread.sleep(5000);
			 for(int i=0; i<4; i++){
				   driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
				  }
			
			Thread.sleep(2000);
			 driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, "0"));
			driver.close();
		} catch (Exception e) {
			System.out.println("not loaded");
			
		}

	}

}
