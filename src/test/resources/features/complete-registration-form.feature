Feature: Filling in a form which contains different type of webelements

  Scenario: Complete the form with valid data
    Given user access 'https://demoqa.com/automation-practice-form' page
    When user complete the registration form with valid data
    | Aliona | Solonari | ali.ona@yahoo.com | Female | 023548764 | some subject | Reading | Moldova |
    Then user clicks on 'Submit' button at the bottom-right side of the page
    And make a screenshot of the displayed popup