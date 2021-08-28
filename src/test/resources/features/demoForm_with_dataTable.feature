Feature: Using DataTable to automate filling in a form

  Scenario: Fill in the form with valid data

    Given user is at 'https://getsimpleform.com/demo' page
    When user complete form with valid data
    | Ali | Ona | Salut |
    And user clicks on 'Submit' buton
    Then a message is displayed
