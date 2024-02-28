package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	@FindBy(xpath="//input[contains(@placeholder,'Search location')]")
	WebElement locationBox;
	
	@FindBy(xpath="//span[@class='c-omni-clear__icon']")
	WebElement clearLocation;
	
	@FindBy(xpath="//div[text()='Chennai']")
	WebElement locationList;

	@FindBy(xpath="//input[contains(@placeholder,'Search doctors')]")
	WebElement searchBox;
	
	
	
	public void searchLocation() throws InterruptedException {
	    locationBox.click();
		js.executeScript("arguments[0].click();",clearLocation);
		Thread.sleep(2000);
		locationBox.sendKeys("Chenna");
		Thread.sleep(3000);
		locationList.click();
	}
	
	public void searchDentist() throws InterruptedException {
		searchBox.click();
		searchBox.sendKeys("dentist");
		Thread.sleep(2000);
	    searchBox.sendKeys(Keys.ENTER);
	}
	
	
}
