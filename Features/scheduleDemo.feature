Feature: Schedule a Demo by Filling the Form

	@sanity @regression

  Scenario: Fill the schedule a demo form
    Given Navigate to Health & Wellness Plans Page
    When the user click on health and wellness plans under for corporates
    And the user fill the form by reading input from excel
    And scrolls the page and passes the invalid email
    Then user validates whether the button is disabled
    When the user refresh the health and wellness page
    And scrolls the page and passes the valid email
    Then user validates whether the button is enabled
    And capture the message displayed after successful form submission
