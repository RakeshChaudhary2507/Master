package mouseover;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MouseOver1 {
	public static void main(String args[]) {
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		
        driver.get("https://opensource-demo.orangehrmlive.com/");
	}

}

