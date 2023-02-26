Feature:

  Scenario Outline: Search for hotels near le-chateau-frontenac, Quebec

    Given I open <Hcom> main page
    When I change the POS to <country>
    And I click on hotels in <city>
    And I select landmarks list
    And I click on <landmark>
    And I select <startdate> as a starting date
    And I select <enddate>
    And click on search
    And sort by <criterion>
    And I click on the heart icon
    Then a confirmation <message> appears


    Examples:
      | Hcom                   | country | city   | landmark             | startdate | enddate | criterion                | message                                          |
      | https://www.hotels.com | Canada  | Quebec | le-chateau-frontenac |           |         | guest rating + our picks | Le Manoir d'Auteuil has been added to your lists |