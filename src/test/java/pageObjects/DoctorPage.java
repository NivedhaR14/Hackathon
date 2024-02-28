package pageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.excelUtility;

public class DoctorPage extends BasePage {

	public DoctorPage(WebDriver driver) {
		super(driver);
	}
	
	String data;
	int row=0;
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	@FindBy(xpath="(//span[text()='Patient Stories'])[1]")
	WebElement patientFilter;
	
	@FindBy(xpath="(//li[@class='c-dropdown__list__item'])[4]")
	WebElement patientOption;
	
	@FindBy(xpath="//span[text()='Experience']")
	WebElement experienceFilter;
	
	@FindBy(xpath="(//li[@class='c-dropdown__list__item'])[6]")
	WebElement experienceOption;
	
	@FindBy(xpath="//span[text()='All Filters']")
	WebElement allFilters;
	
	@FindBy(xpath="//label[@for='Fees1']")
	WebElement feesOption;
	
	@FindBy(xpath="//span[text()='Relevance']")
	WebElement sort;
	
	@FindBy(xpath="(//li[@class='c-dropdown__list__item'])[10]")
	WebElement sortOption;
	
	@FindBy(xpath="//label[@for='Availability3']")
	WebElement availabilityOption;
	
	@FindBy(xpath="//div[@class='info-section']")
	List<WebElement> doctorInfo;
	
	public void selectPatient() throws InterruptedException {
		
		patientFilter.click();
		Thread.sleep(3000);
		js.executeScript("arguments[0].click();",patientOption);
	}
	
	public void selectExperience() throws InterruptedException {
		experienceFilter.click();
		Thread.sleep(3000);
		js.executeScript("arguments[0].click();",experienceOption);
	}
	
	public void clickAllFilters() throws InterruptedException {
		js.executeScript("arguments[0].click();",allFilters);
		Thread.sleep(2000);
	}
	
	public void selectFees() {
		js.executeScript("arguments[0].click();", feesOption);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void clickSortFilter() throws InterruptedException {
		sort.click();
		Thread.sleep(2000);
		sortOption.click();
	}
	
	public void selectAvailability() {
		js.executeScript("arguments[0].click();", availabilityOption);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void getDoctorInfo() {
		for(int i=0;i<5;i++) {
			data = doctorInfo.get(i).getText();
			try {
				excelUtility.write("Sheet1", row, 0, data);
			} catch (IOException e1) {
				e1.printStackTrace();
			}	
			row++;
	    	System.out.println(doctorInfo.get(i).getText());
	    	System.out.println();
	    }
	}

}
