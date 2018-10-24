package imdb;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CastListTest {
	
	private static final String IMDB_HOME = "https://imdb.com";
//	private static final String MOVIE_TITLE = "Kung Fu Hustle";
//	private static final String ACTOR = "Chan";

	private static String movieTitle;
	private static String actorName;
	
	
	WebDriver driver;
	
	@BeforeTest
	public void startup() {
		driver = BrowserSetup.getDriver();
		readParams();
	}

	@Test
	public void isActorPlayedInMovie() {
		
		driver.get(IMDB_HOME);
		
		MainPage mainPage = new MainPage(driver);
		FindPage findPage = mainPage.search(movieTitle);
		TitlePage titlePage = findPage.openFirstItem();
		CreditsPage creditsPage = titlePage.openCredits();
		
		assertTrue(creditsPage.hasCasted(actorName));
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
