@tag
Feature: Amazon home page search
  	As an Amazon user, I want to ensure home page search is working fine

  @smoke
  Scenario: Amazon homepage search
    Given the user is on amazon home page
    When the user searched for "toys"
    Then the results are displayed for "toys"

  @searchDropDown
  Scenario: search drop down menu
    Given the user is on amazon home page
    And the user selects the department "Alexa Skills" from search drop down menu
    When the user searched for "weather"
    Then the results are displayed for "weather"
    And the results header contains department "Alexa Skills"
