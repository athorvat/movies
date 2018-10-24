package imdb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSetup {

	private static WebDriver driver;
	private static boolean ready;

	private static void setup() {
		
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe ");
		
		driver = new ChromeDriver();
		ready = true;
	}
	
	static WebDriver getDriver() {
		if (!ready)
			setup();
		return driver;
	}
}
