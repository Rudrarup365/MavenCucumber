Feature: Feature to test login functionality

  Scenario Outline: Check login succesful with valid scenario
    Given user is on login page
    When usr enters <username> and <password>
    And clicks on login button
    Then user is navigated to the home page

    Examples: 
      | username  | password  |
      | devarghya | devarghya |
      | test      | test      |
