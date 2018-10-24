package imdb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TitlePage extends Page {

	private By credits = By.xpath(".//a[contains(text(), 'cast & crew')]");

	public TitlePage(WebDriver driver) {
		super(driver);
	}
	
	
	CreditsPage openCredits() {
		
		find(credits).click();
		
		return new CreditsPage(driver);
	}
	
}
