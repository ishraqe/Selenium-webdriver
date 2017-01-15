package automateUlelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/ish/chromedriver");	
		WebDriver driver =new ChromeDriver();
		String baseUrl="https://www.google.com/";
		driver.get(baseUrl);
		
		WebElement about=driver.findElement(By.linkText("About"));
		try {
			Actions oActions=new Actions(driver);
			
			oActions.moveToElement(about).build().perform();
			Thread.sleep(3000);
			
			oActions.contextClick(about).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();;
			
			
		} catch (Exception e) {
			
			System.out.println(e);
		}

	}

}
