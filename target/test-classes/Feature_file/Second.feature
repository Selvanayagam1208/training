Feature: Bookcart application demo

  Background: 
    Given download setup files
    When pass the url of webpage
    Then home page displayed

  # I want to use this template for my feature file ..
  @smoke @sanity
  Scenario Outline: Login should be success
    Given User should navigate the application
    And user clicks on the login link
    And User enter the username the "<user>"
    And User enter the password the <pass>
    When User clicks the login button
    Then Login should be success

    Examples: 
      | user         | pass |
      | selva        | 1234 |
      | selvanayagam | 1234 |

  @smoke
  Scenario: signup page
    Given User should navigate the application
    And user clicks on the signup link
      | selva                     |
      | nayagam                   |
      | ambroseselva001@gmail.com |
      |                7639323648 |
    When User clicks the sign in button
    Then register should be success

  @regression
  Scenario: signup page
    Given User should navigate the application
    And user clicks on the signup link
      | kingston                  |
      | surya                     |
      | ambroseselva001@gmail.com |
      |                7639323648 |
    When User clicks the sign in button
    Then register should be success

  @sanity
  Scenario: signup page
    Given User should navigate the application
    And user clicks on the signup link
      | sebastin                  |
      | gowtham                   |
      | ambroseselva001@gmail.com |
      |                7639323648 |
    When User clicks the sign in button
    Then register should be success
