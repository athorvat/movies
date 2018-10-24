package imdb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page {

	protected WebDriver driver;
	protected WebDriverWait wait;
	protected JavascriptExecutor js;
	protected Actions actions;

	public Page(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 10);
		js = (JavascriptExecutor) driver;
		actions = new Actions(driver);
		
	}
	
	WebElement find(By by) {
		return wait.until(ExpectedConditions.elementToBeClickable(by));
	}
	
	List<WebElement> findAll(By by) {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
		return driver.findElements(by);
	}

}