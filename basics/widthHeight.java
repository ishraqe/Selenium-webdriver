package basics;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class widthHeight {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/ish/chromedriver");	
		
		WebDriver driver =new ChromeDriver();
			
		String baseUrl="https://www.facebook.com/";
		driver.get(baseUrl);
		System.out.println(driver.manage().window().getSize());
		
		Dimension d=new Dimension(678, 480);
		driver.manage().window().setSize(d);
		System.out.println(driver.manage().window().getSize());

	}

}
