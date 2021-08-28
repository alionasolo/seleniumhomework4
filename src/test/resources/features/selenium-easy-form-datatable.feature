Feature: Compleate the Selenium Easy form

  Scenario: Complete the form with predefined data
    Given user is on 'https://www.seleniumeasy.com/test/input-form-demo.html' website
    When user fill in all fields with valid data
      | firstName | lastName | email        | phone      | address  | city     | state  | zip   | website  | text       |
      | Dumitru   | Bodac    | mail@mail.ru | 1231233333 | Chisinau | Chisinau | Alaska | 12344 | mydomain | 1234567890 |
    Then user clicks on 'Send' button