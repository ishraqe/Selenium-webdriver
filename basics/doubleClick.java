package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClick {

	public static void main(String[] args) {
		WebDriver driver=chrome.chDriver();
		driver.get("http://google.com");
		Actions actions=new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//input[@name='btnI']"))).doubleClick().build().perform();

	}

}
