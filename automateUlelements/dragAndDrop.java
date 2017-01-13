package automateUlelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/ish/chromedriver");	
		WebDriver driver =new ChromeDriver();
		String baseUrl="http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html";
		driver.get(baseUrl);
		
		WebElement dragObject=driver.findElement(By.xpath(".//*[@id='box2']"));
		WebElement dropArea=driver.findElement(By.xpath(".//*[@id='box102']"));
		
		
		Actions move=new Actions(driver);
		move.dragAndDrop(dragObject, dropArea).build().perform();

	}

}
