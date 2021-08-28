Feature: Complete a form

  Fill in the form using dataTable method

  Scenario: Fill in the form with valid data
    Given user is at 'https://redux-form.com/8.3.0/examples/simple/' website
    When user complete the form with valid data
    | Aliona | Solonari | asp@yahoo.com | Green | I'm an employee |
    And user clicks on 'Submit' button
    Then user accepts the conditions of the displayed alert