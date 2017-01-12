package automateUlelements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alertPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/ish/chromedriver");	
		
		WebDriver driver =new ChromeDriver();
			
		String baseUrl="http://www.javascriptkit.com/javatutors/alert2.shtml";
		driver.get(baseUrl);
		//driver.findElement(By.xpath(".//*[@id='contentcolumn']/form/p/input")).click(); //alert
		driver.findElement(By.xpath(".//*[@id='contentcolumn']/div[7]/table/tbody/tr/td[2]/form/input")).click();//prompt
		
		
		
		WebDriverWait wait = new WebDriverWait(driver, 15, 100);
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert alert=driver.switchTo().alert();
		
		System.out.println(alert.getText());
		alert.sendKeys("ishman");
		System.out.println(alert.getText());
		alert.accept();
		//alert.dismiss();
		
		
		

	}

}
