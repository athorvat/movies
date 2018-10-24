package imdb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FindPage extends Page {

	private By findListFirstItem = By.xpath(".//table[@class='findList']//tr[1]/td[@class='result_text']/a");

	public FindPage(WebDriver driver) {
		super(driver);
	}
	
	TitlePage openFirstItem() {
		find(findListFirstItem).click();
		
		return new TitlePage(driver);
	}
	
	
}
