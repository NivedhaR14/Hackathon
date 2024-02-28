package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SurgeriesPage;
import testBase.BaseClass;

public class surgeryStep {
	SurgeriesPage surgery;
	
	@Given("Navigate to Practo surgeries page")
	public void navigate_to_practo_surgeries_page() {
		surgery = new SurgeriesPage(BaseClass.getDriver());
	}

	@When("the user scroll down to popular surgery")
	public void the_user_scroll_down_to_popular_surgery() {
		BaseClass.getLogger().info("********Starting SurgeryStep********");
		surgery.clickSurgery();
		BaseClass.getLogger().info("********Surgeries under nav header is clicked********");
		BaseClass.getLogger().info("********Navigated to Surgeries page********");
		surgery.scrollToSurgery();
		BaseClass.getLogger().info("********Popular surgeries in surgeries page has been scrolled********");
	}

	@Then("display the popular surgeries provided")
	public void display_the_popular_surgeries_provided() {
		surgery.getSurgeryElement();
		BaseClass.getLogger().info("********All the popular surgeries has been listed********");
		BaseClass.getLogger().info("********Ending surgeryStep********");
	}




}
