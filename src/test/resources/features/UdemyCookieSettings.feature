Feature: Set cookie policy on udemy main page

  Scenario: Set Functional cookies as active and check in the settings
    Given I open the main page
    When I click on the cookie settings
    And I set the Functional cookies as active
    And I save the settings
    And I check the settings
    Then I see that the Functional cookies and Strictly Neccessary Cookies as active


