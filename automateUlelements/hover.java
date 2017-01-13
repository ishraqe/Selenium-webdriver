package automateUlelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class hover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/ish/chromedriver");	
		WebDriver driver =new ChromeDriver();
		String baseUrl="https://www.amazon.com/";
		driver.get(baseUrl);
		
		WebElement element=driver.findElement(By.xpath(".//*[@id='nav-link-prime']/span[2]"));
		Actions hover=new Actions(driver);
		hover.moveToElement(element).build().perform();
	}

}
