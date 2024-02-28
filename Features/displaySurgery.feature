Feature: Display Popular Surgeries

	@sanity @regression
  Scenario: Display Surgeries provided by Practo
    Given Navigate to Practo surgeries page
    When the user scroll down to popular surgery
    Then display the popular surgeries provided
