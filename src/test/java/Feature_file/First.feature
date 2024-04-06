Feature: Bookcart application demo

   I want to use this template for my feature file
  Scenario: Login should be success
    Given User should navigate the application
    And user clicks on the login link
    And User enter the username as "Selva"
    And User enter the password as "Selva123"
    When User clicks the login button
    Then Login should be success

    Scenario: Login should be success for new data
    Given User should navigate the application
    And user clicks on the login link
    And User enter the username as "Selvanayagam"
    And User enter the password as "Selva000"
    When User clicks the login button
    Then Login should be success
    
         