Feature: Make screenshots without market element

  Scenario: Make screenshots on automation practice page without an element
    Given user is on 'http://automationpractice.com/index.php' page
    When there is taken a screenshot of the main page without an element
    Then screenshot is saved