Feature: Return roof specification

  Scenario: Return roof specification
    Given access the link 'https://roofart.md/'
    When click on menu button
    Then a list of categories is displayed
    When choose 'Tablă cutată RoofArt' category from the list
    Then scroll to 'Tablă cutată H12' product
    When click on 'Vezi produsul' button of the product
    Then product page is displayed
    And get the specifications of the product