package automateUlelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAllImageUrl {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "/home/ish/chromedriver");	
		
		WebDriver driver =new ChromeDriver();
			
		String baseUrl="https://www.facebook.com/";
		driver.get(baseUrl);
		List<WebElement> listofimages=driver.findElements(By.tagName("img"));
		
		System.out.println(listofimages.size());
		
		for (int i = 0; i < listofimages.size(); i++) {
			if (!(listofimages.get(i).getAttribute("src").equals("")) && !(listofimages.get(i).getAttribute("src")==null)) {
				System.out.println(listofimages.get(i).getAttribute("src"));
			}
		}
		driver.close();

	}

}
