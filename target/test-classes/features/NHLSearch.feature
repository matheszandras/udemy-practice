Feature: Search for Jim Hughson retirement date

  Scenario Outline: Open NHL.com and search for the announcement of the retirement of Jim Hughson

    Given I open <NHL> website
    When I search for <name>
    And I check the latest result
    Then I check the retirement date
    #September 21, 2021

    Examples:
      | NHL                 | name        |
      | https://www.nhl.com | Jim Hughson |
