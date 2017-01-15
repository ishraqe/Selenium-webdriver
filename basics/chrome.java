package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome {
	public static WebDriver chDriver() {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "/home/ish/chromedriver");	
		
		WebDriver driver =new ChromeDriver();
		return driver;
	}
}
