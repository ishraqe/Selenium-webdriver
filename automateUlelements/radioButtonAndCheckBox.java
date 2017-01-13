package automateUlelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButtonAndCheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/ish/chromedriver");	
		WebDriver driver =new ChromeDriver();
		//String baseUrl="https://www.facebook.com/";
		String another="http://www.jquery-az.com/boots/demo.php?ex=4.0_1";
		driver.get(another);
 
		List<WebElement> radioButtons=driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println(radioButtons.size());
		System.out.println("before clicking " + radioButtons.get(1).isSelected());
		if (radioButtons.get(1).isSelected()==false) {
			radioButtons.get(1).click();
			System.out.println("after clicking " + radioButtons.get(1).isSelected());
			/*
			 * there are some more methods to call 
			 * 1. isDisabled
			 * 2. isEnabled
			 * checkbox is the same like radio buttons
			 */
		}
		
	
		
	}

}
