package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageLoadTimeOut {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=chrome.chDriver();
		driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS); 
		driver.get("http://facebook.com/");

		WebElement myElem = driver.findElement(By.linkText("Log In"));
		try{
			myElem.click();
		}catch(Exception e){
			System.out.println("Eating the Exception");
		}
		
		Thread.sleep(5000);
		driver.close();
	}

}
