package LocatingObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAllelement {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "/home/ish/chromedriver");	
		
		WebDriver driver =new ChromeDriver();
			
		String baseUrl="https://www.facebook.com/";
		driver.get(baseUrl);
		List<WebElement> elements=driver.findElements(By.xpath("//*"));
		
		System.out.println(Integer.toString(elements.size()));
		for (WebElement el:elements) {
			System.out.println(el.getTagName()+" "+el.getText());
		}

	}

}
