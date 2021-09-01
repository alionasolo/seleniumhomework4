Feature: Display description of a movie

  Scenario: Display description of a movie
    Given user access "https://www.cineplex.md/ " website on chrome
    And user select "Filme" category from the main menu
    When user select a movie from the list
    Then next information is displayed
    | infoTitle| info |
    | Gen      | Action Science Fiction Comedie Aventură |
    | Audio    | Rus                                   |
    | Durata filmului | 115 minute                     |
    | Data premierei  | 12.08.2021                     |
    | Format          | 3D                             |
    | Varsta          | 12+                            |
