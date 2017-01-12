package LocatingObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class advancedLocators {

	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "/home/ish/chromedriver");	
		
		WebDriver driver =new ChromeDriver();
			
		String baseUrl="https://www.facebook.com/";
		driver.get(baseUrl);
		
		/*Customized xpath
		 * 
		 *\//tagname[@attributes='value']
		 *	<input  id="u_o_i" type="submit" value="Log in"   />
		 *
		 *\//input[@id='u_o_i']
		 *\//input[@type='submit']
		 *\//input[@value='Log in']
		 *
		 *can also be writen like this , without tag name
		 *\//*[@value='Log In']
		 */
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hello");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("pass");
		
		/*
		 * Customized css path
		 * tagname[attributes='value']
		 * <input  id="u_o_i" type="submit" value="Log In"   />
		 * input[value='Log In']
		 * 
		 * can also be written like this
		 * [value='Log In']
		 */
		//driver.findElement(By.cssSelector("input[value='Log In']")).click();
		
		//or works the same
		driver.findElement(By.cssSelector("[value='Log In']")).click();
		
		
		driver.close();
	}

}
