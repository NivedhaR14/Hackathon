package testCases;

import org.testng.annotations.Test;

import pageObjects.SurgeriesPage;
import testBase.BaseClass;

public class TC_02_SurgeryTest extends BaseClass{
	
	public SurgeriesPage surgery;
	
	@Test(priority=1, groups={"sanity"})
	public void navigateToSurgeries() {
		surgery = new SurgeriesPage(BaseClass.getDriver());
		BaseClass.getLogger().info("********Starting TC_02_SurgeryTest********");
		surgery.clickSurgery();
		BaseClass.getLogger().info("********Surgeries under nav header is clicked********");
		BaseClass.getLogger().info("********Navigated to Surgeries page********");
		surgery.scrollToSurgery();
		BaseClass.getLogger().info("********Popular surgeries in surgeries page has been scrolled********");
	}
	
	@Test(priority=2,groups={"sanity","regression"})
	public void displaySurgeryElements() {
		surgery = new SurgeriesPage(BaseClass.getDriver());
		surgery.getSurgeryElement();
		BaseClass.getLogger().info("********All the popular surgeries has been listed********");
		BaseClass.getLogger().info("********Ending TC_02_SurgeryTest********");
	}

}
