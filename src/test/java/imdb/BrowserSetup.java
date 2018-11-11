package imdb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class BrowserSetup {

	private static WebDriver driver;

	private static void setup() {
		
		ChromeDriverManager.getInstance().setup();
		
		driver = new ChromeDriver();
	}
	
	static WebDriver getDriver() {
		if (driver == null)
			setup();
		return driver;
	}
}
