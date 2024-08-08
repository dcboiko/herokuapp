Feature: Add/Remove Elements interaction - CRUD interactions

    @Test
    Scenario: Adding a single element to display the delete button
    Given I access the menu Add/Remove Elements em herokuapp
    And add an element
    Then a delete button must be displayed