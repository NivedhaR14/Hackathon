package pageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.excelUtility;

public class SurgeriesPage extends BasePage{

	public SurgeriesPage(WebDriver driver) {
		super(driver);
	}
	
	String data;
	int row=0;
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	@FindBy(xpath="//div[text()='Surgeries']")
	WebElement surgeryIcon;
	
	@FindBy(xpath="//h1[text()='Popular Surgeries']")
	WebElement scroll1;
	
	@FindBy(xpath="//div[starts-with(@class,'SurgicalSolutions-module')]")
	List<WebElement> surgeryElement;

	public void clickSurgery() {
		surgeryIcon.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void scrollToSurgery() {
		js.executeScript("arguments[0].scrollIntoView();", scroll1);
	}
	
	public void getSurgeryElement() {
		for(WebElement e : surgeryElement) {
			data = e.getText();
			try {
				excelUtility.write("Sheet1", row, 1, data);
			} catch (IOException e1) {
				e1.printStackTrace();
			}	
			row++;
	    	System.out.println(e.getText());
	    }
	    System.out.println();
	}
}
