package basics;


import java.util.Set;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;



public class cookies {

	public static void main(String[] args) {
		WebDriver driver;
		driver=	chrome.chDriver();
		driver.get("http://fb.com");
		
		Set <Cookie> cookie=driver.manage().getCookies();	
		System.out.println("size of cookies: " + cookie.size() );
	
		for(Cookie x:cookie){
			System.out.println("cookie name: "+ x.getName()+ "  " + "cookie expire"+ x.getExpiry() + " value"+ x.getValue());
		}
		driver.manage().deleteAllCookies();
		System.out.println("size of cookies: " + cookie.size() );
	}

}
