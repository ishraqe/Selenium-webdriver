package basics;

import java.io.File;
import java.io.FileWriter;

import org.openqa.selenium.WebDriver;

public class sourceTofile {
	public static void main(String args[]) {
		WebDriver driver=chrome.chDriver();
		driver.get("http://fb.com");
		String source=driver.getPageSource();
		
		try {
			File sourceFile=new File("/home/ish/Downloads/newText.txt");
			FileWriter fWriter=new FileWriter(sourceFile);
			fWriter.write(source);
			fWriter.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
