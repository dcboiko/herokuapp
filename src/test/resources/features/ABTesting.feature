Feature: ABTesting page properties validation

  @ABTesting
  Scenario: Validating text properties
    Given I access the herokuapp home
    When I access the menu "A/B Testing"
    Then the page "ABTsting" is correctly displayed
