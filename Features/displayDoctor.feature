Feature: Display Doctor Information

  @sanity @regression
  Scenario: Display Doctors Based on Filters
    Given Navigate to Practo doctors page
    When the user search for location and doctor
    And the user click on the dropdowns
    And user selects the option from the dropdowns
    Then display the first five doctors information
