Feature: Add/Remove Elements interaction

  @AddElement
  @AddRemoveElement
  Scenario: Adding a single element to display the delete button
    Given I access the menu "Add/Remove Elements" em herokuapp
    When add 1 elements
    Then 1 elements are visible

  @AddRemoveElement
  @RemoveElement
  Scenario: Deleting an element
    Given I access the menu "Add/Remove Elements" em herokuapp
    And add 1 elements
    When I delete the element
    Then 0 elements are visible

  @AddRemoveElement
  @AddMultipleElements
  Scenario: Adding multiple elements
    Given I access the menu "Add/Remove Elements" em herokuapp
    When add 15 elements
    Then 15 elements are visible
