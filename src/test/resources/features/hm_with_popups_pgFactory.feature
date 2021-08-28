Feature: Improving Common Actions skills

  Scenario: access a popup from the list by scrollToElement method
    Given User is on main page
    When User clicks on 'Sign in' link from Form popup
    And User fills in the form
    And User clicks on 'Sign in' button
    Then User is redirected to main page
