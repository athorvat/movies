package imdb;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreditsPage extends Page {

	By castList = By.xpath(".//table[@class='cast_list']//td[2]/a");
	List<String> cast;
	
	
	public CreditsPage(WebDriver driver) {
		super(driver);
	}
	
	
	boolean hasCasted(String name) {
		
		cast = new ArrayList<String>();
		
		for (WebElement a: findAll(castList)) {
			cast.add(a.getText());
			
			if (a.getText().contains(name)) {
				System.out.println(a.getText());
				return true;
			}
		}
		
		return false;
		
	}

}
