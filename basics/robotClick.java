package basics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.WebDriver;

public class robotClick {

	public static void main(String[] args) throws AWTException {
		WebDriver driver=chrome.chDriver();
		driver.get("http://google.com");
		Robot robot=new Robot();
		robot.mousePress(InputEvent.BUTTON3_MASK);
		robot.mouseRelease(InputEvent.BUTTON3_MASK);
		
	}

}
