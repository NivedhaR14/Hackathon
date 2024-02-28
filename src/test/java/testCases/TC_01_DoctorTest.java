package testCases;

import org.testng.annotations.Test;

import pageObjects.DoctorPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_01_DoctorTest extends BaseClass{
	public DoctorPage dentistObj;
	
	@Test(priority=1, groups={"sanity"})
	public void location()
	{
		HomePage homeObj = new HomePage(BaseClass.getDriver());		
		try {
			BaseClass.getLogger().info("********Starting TC_01_DoctorTest********");
			homeObj.searchLocation();
			BaseClass.getLogger().info("********Location has been selected********");
			homeObj.searchDentist();
			BaseClass.getLogger().info("********Hospitals has been selected********");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority=2,dependsOnMethods= {"location"},groups={"regression"})
	public void patientFilter() throws InterruptedException {
	    dentistObj =  new DoctorPage(BaseClass.getDriver());
	    BaseClass.getLogger().info("********Navigated to Doctor page********");
		dentistObj.selectPatient();
		BaseClass.getLogger().info("********Patient Filter has been selected********");
	}
	
	@Test(priority=3, groups={"regression"})
	public void experienceFilter() {
		try {
			dentistObj =  new DoctorPage(BaseClass.getDriver());
			dentistObj.selectExperience();
			Thread.sleep(2000);
			BaseClass.getLogger().info("********Experience Filter has been selected********");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority=4 ,groups={"sanity"})
	public void allFilters() {
		dentistObj =  new DoctorPage(BaseClass.getDriver());
		try {
			dentistObj.clickAllFilters();
			BaseClass.getLogger().info("********All Filters has been selected********");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority=5, groups={"regression"})
	public void feesFilter() {
		dentistObj =  new DoctorPage(BaseClass.getDriver());
		dentistObj.selectFees();
		BaseClass.getLogger().info("********Select Fees Filter under All Filters has been selected********");
	}
	
	@Test(priority=6, groups={"regression"})
	public void sortFilter() throws InterruptedException {
		dentistObj =  new DoctorPage(BaseClass.getDriver());
		dentistObj.clickSortFilter();
		BaseClass.getLogger().info("********Sort Filter has been selected********");
	}
	
	@Test(priority=7, groups={"regression"})
	public void availableFilter() {
		dentistObj =  new DoctorPage(BaseClass.getDriver());
		allFilters();
		BaseClass.getLogger().info("********All Filters has been selected********");
		dentistObj.selectAvailability();
		BaseClass.getLogger().info("********Availability Filter under All Filters has been selected********");
	}
	
	@Test(priority=8,groups={"sanity","regression"})
	public void displayDoctorInfo() {
		dentistObj =  new DoctorPage(BaseClass.getDriver());
		dentistObj.getDoctorInfo();
		BaseClass.getLogger().info("********First Five Doctors Information has been captured********");
		BaseClass.getLogger().info("********Ending TC_01_DoctorTest********");
	}

}