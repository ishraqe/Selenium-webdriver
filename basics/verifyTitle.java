package basics;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/ish/chromedriver");	
		
		WebDriver driver =new ChromeDriver();
			
		String baseUrl="https://www.facebook.com/";
		driver.get(baseUrl);
		String title=driver.getTitle();
		System.out.println(title);
		
		try {
			Assert.assertTrue(title.contains("Fackkebook"));
			System.out.println("matched");
		} catch (Exception e) {
			System.out.println("not");
		}

	}

}
