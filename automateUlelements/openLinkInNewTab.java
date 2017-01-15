package automateUlelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class openLinkInNewTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/ish/chromedriver");	
		WebDriver driver =new ChromeDriver();
		String baseUrl="http://shohoj.com/";
		driver.get(baseUrl);
		
		/*
		 * opens a link in a new tab
		 */
		
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN); 
		driver.findElement(By.linkText("Services")).sendKeys(selectLinkOpeninNewTab);
		
		/*
		 * opens new empty tab
		 * 
		 */
//		String selectEmptyLinkOpeninNewTab = Keys.chord(Keys.CONTROL,"t");
//		driver.findElement(By.linkText("Services")).sendKeys(selectEmptyLinkOpeninNewTab);
	}

}
