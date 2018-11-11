package imdb;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class CastListTest extends TestSetup {
	
	private static final String IMDB_HOME = "https://imdb.com";
	
	
	@Test
	public void isActorPlayedInMovie() {
		
		driver.get(IMDB_HOME);
		
		boolean casted = new MainPage(driver)
			.search(movieTitle)
			.openFirstItem()
			.openCredits()
			.hasCasted(actorName);
		
		assertTrue(casted);
	}
}
