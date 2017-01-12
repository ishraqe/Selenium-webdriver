package automateUlelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/ish/chromedriver");	
		
		WebDriver driver =new ChromeDriver();
			
		String baseUrl="https://www.facebook.com/";
		driver.get(baseUrl);
		
		WebElement day=driver.findElement(By.xpath(".//*[@id='day']"));
		Select dayDropDown=new Select(day);
		
		/*
		 * can be used by multiple selections
		 */
		
		dayDropDown.selectByValue("1");
		
		WebElement month=driver.findElement(By.xpath(".//*[@id='month']"));
		Select monthDropDown=new Select(month);
		monthDropDown.selectByIndex(2);
		
		
		WebElement year=driver.findElement(By.xpath(".//*[@id='year']"));
		Select yearDropDown=new Select(year);
		yearDropDown.selectByVisibleText("2017");
		
		System.out.println(yearDropDown.isMultiple()); //checks if it takes multiple value
		
		//can also be de-selected by the same way
	}

}
