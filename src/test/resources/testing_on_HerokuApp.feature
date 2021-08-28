Feature: Practice with Page Factory

  Scenario: Access element from a list by name
    Given User is at heroku page
    When User clicks on 'Exit Intent' link
    Then 'Exit Intent' is displayed