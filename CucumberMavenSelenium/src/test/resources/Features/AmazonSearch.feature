@tag
Feature: Amazon homepage search
			As an Amazon user, I want to ensure homepage search is working fine 

  @smoke
  Scenario: Amazon homepage search
    Given the user is on amazon homepage
    When the user searched for "toys"
    Then the results are displayed for "toys"
