package basics;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;

public class timestamp {

	public static void main(String[] args) {
		WebDriver driver=chrome.chDriver();
		DateFormat df =new SimpleDateFormat("yyyy_MMM_dd HH_MM_SS");
		Date date=new Date();
		String time=df.format(date);
		driver.get("http://fb.com");
		System.out.println(time);
		driver.close();
	}

}
