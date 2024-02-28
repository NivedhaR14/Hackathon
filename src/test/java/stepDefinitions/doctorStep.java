package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DoctorPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class doctorStep {
	DoctorPage doctor;
	HomePage home;
	
	@Given("Navigate to Practo doctors page")
	public void navigate_to_practo_doctors_page() {
		home = new HomePage(BaseClass.getDriver());
		doctor = new DoctorPage(BaseClass.getDriver()); 
	}

	@When("the user search for location and doctor")
	public void the_user_search_for_location_and_doctor() throws InterruptedException {
		BaseClass.getLogger().info("********Starting doctorStep********");
		home.searchLocation();
		BaseClass.getLogger().info("********Location has been selected********");
		home.searchDentist();
		BaseClass.getLogger().info("********Hospitals has been selected********");
	}

	@When("the user click on the dropdowns")
	public void the_user_click_on_the_dropdowns() throws InterruptedException {
		BaseClass.getLogger().info("********Navigated to Doctor page********");
		doctor.selectPatient();
		BaseClass.getLogger().info("********Patient Filter has been selected********");
        doctor.selectExperience();
        BaseClass.getLogger().info("********Experience Filter has been selected********");
	}

	@When("user selects the option from the dropdowns")
	public void user_selects_the_option_from_the_dropdowns() throws InterruptedException {
		doctor.clickAllFilters();
		BaseClass.getLogger().info("********All Filters has been selected********");
		doctor.selectFees();
		BaseClass.getLogger().info("********Select Fees Filter under All Filters has been selected********");
		doctor.clickSortFilter();
		BaseClass.getLogger().info("********Sort Filter has been selected********");
		doctor.clickAllFilters();
		BaseClass.getLogger().info("********All Filters has been selected********");
		doctor.selectAvailability();
		BaseClass.getLogger().info("********Availability Filter under All Filters has been selected********");
	}

	@Then("display the first five doctors information")
	public void display_the_first_five_doctors_information() {
		doctor.getDoctorInfo();
		BaseClass.getLogger().info("********First Five Doctors Information has been captured********");
		BaseClass.getLogger().info("********Ending doctorStep********");
	}

}
