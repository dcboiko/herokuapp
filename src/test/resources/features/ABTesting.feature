Feature: ABTesting page properties validation

  @Test
  Scenario: Validating text properties
    Given I access the herokuapp home
    When I access the menu "A/B Testing"
    Then the page "A/B Test Control" is correctly displayed
