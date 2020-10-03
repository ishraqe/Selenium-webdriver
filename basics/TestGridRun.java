package test.java;

import static junit.framework.Assert.assertTrue;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestGridRun {
	 private WebDriver driver;
	 private WebDriverWait wait;
	
	
	  @Before 
	  public void setUp() { 
		  DesiredCapabilities capability = DesiredCapabilities.firefox();
			try {
				driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
				wait = new WebDriverWait(driver, 10);
				driver.get("http://www.google.com"); 
			} catch (MalformedURLException e) {
				e.printStackTrace();
				System.out.println("Hub URL not correcly formatted!");
			}
	  } 

	  @After 
	  public void tearDown() throws IOException { 
	    driver.quit(); 
	  } 

	  @Test 
	  public void pageTitleAfterSearchShouldBeginWithDrupal() throws IOException { 
	    WebElement searchField = driver.findElement(By.name("q")); 
	    searchField.sendKeys("Drupal!"); 
	    searchField.submit(); 

		assertTrue("The page title should start with the search string after the search.", 
	        wait.until(new ExpectedCondition<Boolean>() { 
	          public Boolean apply(WebDriver d) { 
	            return d.getTitle().toLowerCase().startsWith("drupal!"); 
	          } 
	        })); 
	  } 
	
}
