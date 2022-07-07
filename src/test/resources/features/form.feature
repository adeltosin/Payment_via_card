Feature: As a student I want to complete the form
@Regression @smoke
  Scenario: Valid Complete form
    Given I navigate to the website
    And I fill all the registration form
    When I click on the submit button
    Then the form completed successfully