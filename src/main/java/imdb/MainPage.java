package imdb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class MainPage extends Page {

	By quickSearchType = By.id("quicksearch");
	By quickSearchBar = By.id("navbar-query");
	Select quickSearchTypeSelect;
	By submit = By.id("navbar-submit-button");
	

	public MainPage(WebDriver driver) {
		super(driver);
	}


	FindPage search(String movieTitle) {
		
		find(quickSearchBar).sendKeys(movieTitle);
		quickSearchTypeSelect = new Select(find(quickSearchType));
		quickSearchTypeSelect.selectByVisibleText("Titles");
		find(submit).click();
		
		return new FindPage(driver);
		
	}

}
