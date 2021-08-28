Feature: Select a specific winery from the list of wineries

  Scenario: Acces a winery from the list

    Given User is on winery page
    When User access 'Excursii la vinarii' section
    And User clicks on 'Castel Mimi Wine Resort' item
    Then The 'Castel Mimi Wine Resort' page is displayed