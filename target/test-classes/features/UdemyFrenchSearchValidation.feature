Feature: Search in Udemy in French

  Scenario Outline: Switch to French language and search for Android mobile app development courses

    Given I open the main page
    When I switch to French language
    And I search for <Android app development> phrase
    Then I check the first result

    Examples:
      | Android app development            |
      | développer une application android |