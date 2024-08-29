Feature: Test google search functionality

  Scenario: Validate google search is working
    Given browser is open
    And user is on google search page
    When user enters a tet is search box
    And hits enter
    Then user is navigated to search results

    
    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |

    