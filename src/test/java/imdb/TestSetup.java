package imdb;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestSetup {

	static String movieTitle;
	static String actorName;
	WebDriver driver;
	
	
	@BeforeTest
	public void startup() {
		driver = BrowserSetup.getDriver();
		readParams();
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}
	
	
	void readParams() {
		actorName = System.getProperty("actorname");
		movieTitle = System.getProperty("movietitle");
	}
}
