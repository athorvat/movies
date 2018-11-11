package imdb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreditsPage extends Page {

	By cast = By.xpath(".//table[@class='cast_list']//td[2]/a");
	By characters = By.xpath(".//table[@class='cast_list']//td[4]/a");
	
	
	public CreditsPage(WebDriver driver) {
		super(driver);
	}
	
	
	boolean hasCasted(String name) {
		
		List<WebElement> castList = findAll(cast);
		List<WebElement> charactersList = findAll(characters);
		
		for (int i = 0; i < castList.size(); i++) {
			if (castList.get(i).getText().contains(name)) {
				System.out.print(castList.get(i).getText() + " as ");
				System.out.println(charactersList.get(i).getText());
				return true;
			}
		}
		
		return false;
		
	}

}
