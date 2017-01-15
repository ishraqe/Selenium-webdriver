package basics;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class openNewWindow {

	public static void main(String[] args) {
		WebDriver driver=chrome.chDriver();
		driver.get("http://bing.com");
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"n");

	}

}
