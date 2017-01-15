package basics;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class getBrowserType {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "/home/ish/chromedriver");	
		
		WebDriver driver =new ChromeDriver();
		Capabilities capabilities=((RemoteWebDriver)driver).getCapabilities();
		String name=capabilities.getBrowserName(),version=capabilities.getVersion();
		System.out.println(name+" "+version);
	}

}
