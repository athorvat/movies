package imdb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class BrowserSetup {

	private static WebDriver driver;
	private static boolean ready;

	private static void setup() {
		
		ChromeDriverManager.getInstance().setup();
		
		driver = new ChromeDriver();
		ready = true;
	}
	
	static WebDriver getDriver() {
		if (!ready)
			setup();
		return driver;
	}
}
