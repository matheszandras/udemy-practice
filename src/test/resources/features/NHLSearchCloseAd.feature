Feature: Search for Jim Hughson retirement date

  Scenario Outline: Open NHL.com and search for the announcement of the retirement of Jim Hughson

    Given I open <NHL> website and close the ad
    When I search for <name>
    And I check the latest result
    Then I check the retirement date

    Examples:
      | NHL                 | name        |
      | https://www.nhl.com | Jim Hughson |